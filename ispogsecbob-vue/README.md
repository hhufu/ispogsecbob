# 基于区块链政校企合作信息共享平台(ISPOGSECBOB-VUE)

#### 项目介绍

基于区块链政校企合作信息共享平台

Information sharing platform of government school enterprise cooperation based on blockchain

#### 软件架构
>软件架构说明 :vue + element UI

#### 安装教程

1. 安装依赖：`npm install chromedriver --chromedriver_cdnurl=http://cdn.npm.taobao.org/dist/chromedriver && npm install`
2. 开发运行：`npm run dev`
3. 构建编译：`npm run build`
3. 打包镜像：`docker build -t mikeyboom/ispogsecbob-vue:v1.3.2 .`
4. 推送仓库：`docker push mikeyboom/ispogsecbob-vue`
5. 拉取镜像：`docker pull mikeyboom/ispogsecbob-vue:v1.3.2`
6. 部署镜像：`docker-componse -f docker-compose.yml -d`


>Linux平台前端项目vue无法热更新 在启动时请使用 sudo npm run dev


#### 持续集成平台
>Travis ci
