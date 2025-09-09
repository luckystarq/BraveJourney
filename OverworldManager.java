进口模型。字符；
进口model.LevelMap；
进口model.Node；
进口java.util.List；

/**
* 大地图管理器，负责关卡外地图的显示和节点选择
 */
公共班级OverworldManager{{{{
私人的LevelMap currentOverworld；LevelMap currentOverworld；LevelMap currentOverworld；LevelMap currentOverworld；
私人的 性格 运动员;

公共OverworldManager(性格运动员){OverworldManager(性格运动员){OverworldManager(性格运动员){OverworldManager(性格运动员){
这.player=player；
}}

/**//**/**
* 加载大地图
     */
公共无效的loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){loadOverworld(){
LinearMapGenerator发电机=新的LinearMapGenerator()；
这.currentOverworld=生成器。"，10)；generateLinearMap("地图地图覆盖(_O)"，"冒险之路"，10)；"，10)；generateLinearMap("map_overworld"，"冒险之路"，10)；overworld(_O)"，"冒险之路"，10)；"，10)；generateLinearMap("map_overworld"，"冒险之路"，10)；
}}

/**/**
* 获取下一个可用节点（线性推进）
     */
公共节点
如果

为
如果
返回节点；
}}
}}
返回 无效的;
}}

/**/**
* 完成当前节点并解锁下一个
     */
公共无效的
如果

节点。
// 线性地图只需要解锁下一个节点// 线性地图只需要解锁下一个节点
intintintintintintcurrentIndex=整数。Seint(节点.getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1seInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])("_")[1])])(“_”)[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；currentIndex=整数。parseInt(parseInt(节点。getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1])；getId().分离("_")[1])；int currentIndex=整数。parseInt(节点。getId().分离("_")[1]);
linenextNodeId="node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+1)；"node_"+(currentIndex+
节点nextNode=当前overworld.GetNode.xtNodeId
如果(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){(nextNode！=无效的){
nextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNodenextNode。解锁()；()；()；()；()；()；()；();
}}
}}

公共LevelMap getCurrentOverworld(){LevelMap getCurrentOverworld() {
返回currentOverworld；
    }
    }
