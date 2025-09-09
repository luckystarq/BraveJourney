import model.Character;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== 线性冒险游戏 =====");
        System.out.print("请输入你的名字：");
        String playerName = scanner.nextLine();

        // 创建玩家角色
        Character player = new Character("player_1", playerName, 100, 10, 3);

        // 创建并启动游戏流程控制器
        GameFlowController gameController = new GameFlowController(player);
        gameController.startGame();

        scanner.close();
        System.out.println("感谢游玩！");
    }
}
