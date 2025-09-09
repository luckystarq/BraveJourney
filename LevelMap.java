package model;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 关卡地图类，管理选关地图的所有节点
 * 负责节点的解锁和状态管理
 */
public class LevelMap {
    // 地图唯一标识
    private final String id;
    // 地图名称
    private final String name;
    // 节点映射（ID -> 节点实例）
    private final Map<String, Node> nodes = new HashMap<>();
    // 起始节点ID
    private final String startingNodeId;
    
    /**
     * 构造函数
     * @param id 地图ID
     * @param name 地图名称
     * @param nodes 节点列表
     * @param startingNodeId 起始节点ID
     */
    public LevelMap(String id, String name, List<Node> nodes, String startingNodeId) {
        this.id = id;
        this.name = name;
        this.startingNodeId = startingNodeId;
        
        // 将节点添加到映射中
        for (Node node : nodes) {
            this.nodes.put(node.getId(), node);
        }
    }
    
    /**
     * 解锁起始节点
     */
    public void unlockStartingNode() {
        Node startNode = nodes.get(startingNodeId);
        if (startNode != null) {
            startNode.unlock();
        }
    }
    
    /**
     * 解锁与指定节点连接的所有节点
     * @param nodeId 节点ID
     */
    public void unlockConnectedNodes(String nodeId) {
        Node node = nodes.get(nodeId);
        if (node == null) return;
        
        for (String connectedId : node.getConnectedNodes()) {
            Node connectedNode = nodes.get(connectedId);
            if (connectedNode != null && !connectedNode.isUnlocked()) {
                connectedNode.unlock();
                System.out.println("解锁了新节点：" + connectedNode.getName());
            }
        }
    }
    
    /**
     * 根据ID获取节点
     * @param nodeId 节点ID
     * @return 节点实例，不存在则返回null
     */
    public Node getNode(String nodeId) {
        return nodes.get(nodeId);
    }
    
    // Getter方法
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Node> getAllNodes() {
        return new ArrayList<>(nodes.values());
    }
    
    public String getStartingNodeId() {
        return startingNodeId;
    }
}
