import model.LevelMap;
import model.Node;
import model.Character;
import java.util.List;

/**
 * UI管理器类，负责所有界面显示逻辑
 * 包括菜单、地图、角色状态等信息的展示
 */
public class UIManager {
    
    /**
     * 显示主菜单
     */
    public void showMainMenu() {
        System.out.println("\n===== 主菜单 =====");
        System.out.println("1. 查看地图");
        System.out.println("2. 选择节点");
        System.out.println("3. 查看状态");
        System.out.println("4. 退出游戏");
    }
    
    /**
     * 显示当前地图状态
     * @param map 要显示的地图实例
     */
    public void showMap(LevelMap map) {
        if (map == null) return;
        
        System.out.println("\n===== " + map.getName() + " =====");
        System.out.println("节点列表：");
        for (Node node : map.getAllNodes()) {
            String status = node.isCompleted() ? "[已完成]" : 
                          (node.isUnlocked() ? "[可选择]" : "[未解锁]");
            System.out.printf("  %s: %s (%s) %s%n", 
                           node.getId(), node.getName(), node.getType(), status);
        }
    }
    
    /**
     * 显示可选择的节点
     * @param map 当前地图实例
     */
    public void showAvailableNodes(LevelMap map) {
        if (map == null) return;
        
        System.out.println("\n可选择的节点：");
        for (Node node : map.getAllNodes()) {
            if (node.isUnlocked() && !node.isCompleted()) {
                System.out.printf("  %s: %s - %s%n", 
                               node.getId(), node.getName(), node.getDescription());
            }
        }
    }
    
    /**
     * 显示玩家状态
     * @param player 玩家角色实例
     */
    public void showPlayerStatus(Character player) {
        if (player == null) return;
        
        System.out.println("\n===== 角色状态 =====");
        System.out.println("姓名：" + player.getName());
        System.out.println("生命值：" + player.getCurrentHealth() + "/" + player.getMaxHealth());
        System.out.println("攻击力：" + player.getAttack());
        System.out.println("防御力：" + player.getDefense());
    }
}
