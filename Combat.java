package model;

/**
 * 战斗类，处理玩家与敌人之间的战斗逻辑
 */
public class Combat {
    // 玩家角色
    private final Character player;
    // 当前关卡
    private final Level level;
    // 战斗是否胜利
    private boolean victorious;
    
    /**
     * 构造函数
     * @param player 玩家角色
     * @param level 战斗关卡
     */
    public Combat(Character player, Level level) {
        this.player = player;
        this.level = level;
        this.victorious = false;
    }
    
    /**
     * 开始战斗
     */
    public void start() {
        System.out.println("\n===== 进入战斗：" + level.getName() + " =====");
        System.out.println("敌人出现：");
        for (Character enemy : level.getEnemies()) {
            System.out.println("- " + enemy.getName() + " (生命值: " + enemy.getCurrentHealth() + 
                           ", 攻击力: " + enemy.getAttack() + ")");
        }
        
        // 战斗循环
        while (player.isAlive() && !level.isCleared()) {
            // 玩家回合
            playerTurn();
            
            // 检查敌人是否全部被击败
            if (level.isCleared()) {
                break;
            }
            
            // 敌人回合
            enemiesTurn();
            
            // 检查玩家是否死亡
            if (!player.isAlive()) {
                break;
            }
        }
        
        // 战斗结果
        if (player.isAlive() && level.isCleared()) {
            System.out.println("\n战斗胜利！");
            victorious = true;
        } else {
            System.out.println("\n战斗失败！");
            victorious = false;
        }
    }
    
    /**
     * 玩家回合：攻击第一个活着的敌人
     */
    private void playerTurn() {
        System.out.println("\n===== 你的回合 =====");
        // 找到第一个活着的敌人
        for (Character enemy : level.getEnemies()) {
            if (enemy.isAlive()) {
                player.attack(enemy);
                if (!enemy.isAlive()) {
                    System.out.println(enemy.getName() + "被击败了！");
                }
                break;
            }
        }
    }
    
    /**
     * 敌人回合：所有活着的敌人攻击玩家
     */
    private void enemiesTurn() {
        System.out.println("\n===== 敌人回合 =====");
        for (Character enemy : level.getEnemies()) {
            if (enemy.isAlive()) {
                enemy.attack(player);
                if (!player.isAlive()) {
                    break;
                }
            }
        }
    }
    
    /**
     * 发放战斗奖励
     */
    public void grantRewards() {
        System.out.println("\n===== 获得战斗奖励 =====");
        for (Item item : level.getRewards()) {
            item.applyTo(player);
        }
        
        // 击败敌人获得属性提升
        int attackBoost = level.getEnemies().size() * 2;
        int defenseBoost = level.getEnemies().size();
        player.boostStats(attackBoost, defenseBoost);
    }
    
    /**
     * 检查战斗是否胜利
     * @return 胜利返回true，否则返回false
     */
    public boolean isVictorious() {
        return victorious;
    }
  }
