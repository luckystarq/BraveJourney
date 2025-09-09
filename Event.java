package model;

import java.util.List;

/**
 * 事件类，包含事件描述、选项和执行逻辑
 * 玩家选择不同选项会产生不同结果
 */
public class Event {
    /**
     * 事件选项内部类，表示事件中的一个可选操作
     */
    public static class Option {
        // 选项文本
        private final String text;
        // 结果描述
        private final String resultText;
        // 奖励物品（可选）
        private final Item rewardItem;
        // 生命值变化（正数为加，负数为减）
        private final int healthChange;
        // 攻击力变化
        private final int attackChange;
        // 防御力变化
        private final int defenseChange;
        
        /**
         * 构造函数
         * @param text 选项文本
         * @param resultText 结果描述
         * @param rewardItem 奖励物品
         * @param healthChange 生命值变化
         * @param attackChange 攻击力变化
         * @param defenseChange 防御力变化
         */
        public Option(String text, String resultText, Item rewardItem, 
                     int healthChange, int attackChange, int defenseChange) {
            this.text = text;
            this.resultText = resultText;
            this.rewardItem = rewardItem;
            this.healthChange = healthChange;
            this.attackChange = attackChange;
            this.defenseChange = defenseChange;
        }
        
        // Getter方法
        public String getText() {
            return text;
        }
        
        public String getResultText() {
            return resultText;
        }
    }
    
    // 事件唯一标识
    private final String id;
    // 事件名称
    private final String name;
    // 事件描述
    private final String description;
    // 事件选项列表
    private final List<Option> options;
    
    /**
     * 构造函数
     * @param id 事件ID
     * @param name 事件名称
     * @param description 事件描述
     * @param options 事件选项列表
     */
    public Event(String id, String name, String description, List<Option> options) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.options = options;
    }
    
    /**
     * 执行选中的事件选项
     * @param optionIndex 选项索引
     * @param player 玩家角色
     */
    public void executeOption(int optionIndex, Character player) {
        if (optionIndex < 0 || optionIndex >= options.size()) {
            return;
        }
        
        Option option = options.get(optionIndex);
        System.out.println("\n" + description);
        System.out.println("你选择了：" + option.getText());
        System.out.println(option.getResultText());
        
        // 应用属性变化
        if (option.healthChange > 0) {
            player.heal(option.healthChange);
            System.out.println(player.getName() + "恢复了" + option.healthChange + "点生命值！");
        } else if (option.healthChange < 0) {
            player.takeDamage(-option.healthChange);
        }
        
        // 应用攻击和防御变化
        if (option.attackChange != 0 || option.defenseChange != 0) {
            player.boostStats(option.attackChange, option.defenseChange);
        }
        
        // 发放奖励物品
        if (option.rewardItem != null) {
            option.rewardItem.applyTo(player);
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
    
    public List<Option> getOptions() {
        return options;
    }
      }
