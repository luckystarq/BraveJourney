package model;

import java.util.List;

/**
 * 关卡类，管理关卡内的敌人和奖励
 * 代表游戏中的一个具体关卡
 */
public class Level {
    // 关卡唯一标识
    private final String id;
    // 关卡名称
    private final String name;
    // 关卡中的敌人列表
    private final List<Character> enemies;
    // 关卡奖励物品列表
    private final List<Item> rewards;
    
    /**
     * 构造函数
     * @param id 关卡ID
     * @param name 关卡名称
     * @param enemies 敌人列表
     * @param rewards 奖励物品列表
     */
    public Level(String id, String name, List<Character> enemies, List<Item> rewards) {
        this.id = id;
        this.name = name;
        this.enemies = enemies;
        this.rewards = rewards;
    }
    
    /**
     * 检查关卡是否已清除（所有敌人被击败）
     * @return 已清除返回true，否则返回false
     */
    public boolean isCleared() {
        for (Character enemy : enemies) {
            if (enemy.isAlive()) {
                return false;
            }
        }
        return true;
    }
    
    // Getter方法
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Character> getEnemies() {
        return enemies;
    }
    
    public List<Item> getRewards() {
        return rewards;
    }
}
