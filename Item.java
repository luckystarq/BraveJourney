package model;

/**
 * 物品类，包含消耗品和装备
 * 用于修改角色属性
 */
public class Item {
    // 物品类型枚举
    public enum Type {
        CONSUMABLE,  // 消耗品（使用后消失）
        EQUIPMENT    // 装备（持久生效）
    }
    
    // 物品唯一标识
    private final String id;
    // 物品名称
    private final String name;
    // 物品描述
    private final String description;
    // 物品类型
    private final Type type;
    // 攻击加成
    private final int attackBonus;
    // 防御加成
    private final int defenseBonus;
    // 生命增减
    private final int healthChange;
    
    /**
     * 物品构造函数
     * @param id 唯一标识
     * @param name 名称
     * @param description 描述
     * @param type 物品类型
     * @param attackBonus 攻击加成
     * @param defenseBonus 防御加成
     * @param healthChange 生命增减
     */
    public Item(String id, String name, String description, Type type, 
               int attackBonus, int defenseBonus, int healthChange) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.healthChange = healthChange;
    }
    
    /**
     * 将物品效果应用到角色身上
     * @param target 目标角色
     */
    public void applyTo(Character target) {
        System.out.println(target.getName() + "获得了" + name + "！");
        
        // 应用属性加成
        if (attackBonus != 0) {
            target.boostStats(attackBonus, 0);
        }
        if (defenseBonus != 0) {
            target.boostStats(0, defenseBonus);
        }
        if (healthChange != 0) {
            if (healthChange > 0) {
                target.heal(healthChange);
                System.out.println(target.getName() + "恢复了" + healthChange + "点生命值！");
            } else {
                target.takeDamage(-healthChange); // 负数表示伤害
            }
        }
    }
    
    // Getter方法
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Type getType() {
        return type;
    }
                  }
