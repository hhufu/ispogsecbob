package com.ispogsecbob.modules.enterprise.config;

/**
 * @author: Mikey
 * Email：biaogejiushibiao@outlook.com
 * Date: 2018/11/25
 **/
public class ConfigApi {
//    大创审批流程队列
//    ["项目负责人","指导老师","二级学院","管理员","评委","管理员","超级管理员"]
    public static Long[] auditListName = {2L, 3L, 4L, 5L, 6L, 5L, 1L};
//    基地审批流程队列
//    ["项目负责人","指导老师","管理员","评委","管理员","超级管理员"]
    public static Long[] baseListName = {2L, 3L, 5L, 6L, 5L, 1L};
//    比赛审批流程队列
//    ["项目负责人","指导老师","二级学院","管理员","评委","管理员","超级管理员"]
    public static Long[] matchListName = {2L, 3L, 4L, 5L, 6L, 5L, 1L};
//    结题审批流程队列
//    ["项目负责人","指导老师","二级学院","管理员","评委","管理员","超级管理员"]
    public static Long[] finishListName = {2L, 3L, 4L, 5L, 6L, 5L, 1L};
//    文件存储路径
    public static String UPLOAD_URL = "/home/mikey/MIKEY/";
//    教师附件路径
    public static String TEACHER_FILE_UPLOAD_URL = "/home/mikey/MIKEY/teacher/";
//    学生附件路径
    public static String STUDENT_FILE_UPLOAD_URL = "/home/mikey/MIKEY/student/";
//    模板文件存储路径
    public static String TEMPLATE_URL = "/TEMPLATE/";
}
