package com.ispogsecbob.modules.job.controller;

import com.ispogsecbob.common.annotation.SysLog;
import com.ispogsecbob.common.utils.PageUtils;
import com.ispogsecbob.common.utils.R;
import com.ispogsecbob.common.validator.ValidatorUtils;
import com.ispogsecbob.modules.job.entity.ScheduleJobEntity;
import com.ispogsecbob.modules.job.service.ScheduleJobService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.2.0 2016-11-28
 */
@RestController
@RequestMapping("/sys/schedule")
public class ScheduleJobController {
	@Autowired
	private ScheduleJobService scheduleJobService;
	
	/**
	 * 定时任务列表
	 */
	@GetMapping("/list")
	@RequiresPermissions("sys:schedule:list")
	public R list(@RequestParam Map<String, Object> params){
		PageUtils page = scheduleJobService.queryPage(params);

		return R.ok().put("page", page);
	}
	
	/**
	 * 定时任务信息
	 */
	@GetMapping("/info/{jobId}")
	@RequiresPermissions("sys:schedule:info")
	public R info(@PathVariable("jobId") Long jobId){
		ScheduleJobEntity schedule = scheduleJobService.selectById(jobId);
		
		return R.ok().put("schedule", schedule);
	}
	
	/**
	 * 保存定时任务
	 */
	@SysLog("保存定时任务")
	@PostMapping("/save")
	@RequiresPermissions("sys:schedule:save")
	public R save(@RequestBody ScheduleJobEntity scheduleJob){
		ValidatorUtils.validateEntity(scheduleJob);
		
		scheduleJobService.save(scheduleJob);
		
		return R.ok();
	}
	
	/**
	 * 修改定时任务
	 */
	@SysLog("修改定时任务")
	@PostMapping("/update")
	@RequiresPermissions("sys:schedule:update")
	public R update(@RequestBody ScheduleJobEntity scheduleJob){
		ValidatorUtils.validateEntity(scheduleJob);
				
		scheduleJobService.update(scheduleJob);
		
		return R.ok();
	}
	
	/**
	 * 删除定时任务
	 */
	@SysLog("删除定时任务")
	@PostMapping("/delete")
	@RequiresPermissions("sys:schedule:delete")
	public R delete(@RequestBody Long[] jobIds){
		scheduleJobService.deleteBatch(jobIds);
		
		return R.ok();
	}
	
	/**
	 * 立即执行任务
	 */
	@SysLog("立即执行任务")
	@PostMapping("/run")
	@RequiresPermissions("sys:schedule:run")
	public R run(@RequestBody Long[] jobIds){
		scheduleJobService.run(jobIds);
		
		return R.ok();
	}
	
	/**
	 * 暂停定时任务
	 */
	@SysLog("暂停定时任务")
	@PostMapping("/pause")
	@RequiresPermissions("sys:schedule:pause")
	public R pause(@RequestBody Long[] jobIds){
		scheduleJobService.pause(jobIds);
		
		return R.ok();
	}
	
	/**
	 * 恢复定时任务
	 */
	@SysLog("恢复定时任务")
	@PostMapping("/resume")
	@RequiresPermissions("sys:schedule:resume")
	public R resume(@RequestBody Long[] jobIds){
		scheduleJobService.resume(jobIds);
		
		return R.ok();
	}

}
