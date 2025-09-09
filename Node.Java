package model;

import java.util.List;

/**
 * 节点类，表示地图上的单个节点
 * 可以是战斗、事件或休息类型
 */
public class Node {
    // 节点类型枚举
    public enum Type {
        BATTLE,  // 战斗节点
        EVENT,   // 事件节点
        REST     // 休息节点
    }
    
    // 节点唯一标识
    private final String id;
    // 节点类型
    private final Type type;
    // 节点名称
    private final String name;
    // 节点描述
    private final String description;
    // 关联内容ID（如战斗关卡ID、事件ID）
    private final String relatedContentId;
    // 连接的节点ID列表
    private final List<String> connectedNodes;
    // 节点是否已解锁
    private boolean unlocked;
    // 节点是否已完成
    private boolean completed;
    
    /**
     * 构造函数
     * @param id 节点ID
     * @param type 节点类型
     * @param name 节点名称
     * @param description 节点描述
     * @param relatedContentId 关联内容ID
     * @param connectedNodes 连接的节点ID列表
     */
    public Node(String id, Type type, String name, String description, 
               String relatedContentId, List<String> connectedNodes) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.relatedContentId = relatedContentId;
        this.connectedNodes = connectedNodes;
        this.unlocked = false;
        this.completed = false;
    }
    
    /**
     * 解锁节点
     */
    public void unlock() {
        this.unlocked = true;
    }
    
    /**
     * 标记节点为已完成
     */
    public void markCompleted() {
        this.completed = true;
    }
    
    // Getter方法
    public String getId() {
        return id;
    }
    
    public Type getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getRelatedContentId() {
        return relatedContentId;
    }
    
    public List<String> getConnectedNodes() {
        return connectedNodes;
    }
    
    public boolean isUnlocked() {
        return unlocked;
    }
    
    public boolean isCompleted() {
        return completed;
    }
    
    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
