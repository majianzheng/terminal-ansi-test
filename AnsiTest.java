import java.io.Console;

/**
 * 终端Ansi标准测试
 *
 * @author majianzheng
 */
public class AnsiTest {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(">>>>>>\033[1;33m终端ANSI CSI标准支持测试程序\033[0m<<<<<<");
		System.out.println("终端8位256色标准支持，打印256色");
		for (int i = 0; i < 16; ++i) {
			for (int j = 0; j < 16; ++j) {
				int number = i * 16 +j;
				String str = String.format("%3d", number);
				System.out.print(String.format("\033[48;5;%dm %s", number, str));
				System.out.print("\033[0m");
			}
			System.out.println();
		}
		System.out.println("终端3/4位8种基本色");
		for (int i=40; i< 48; ++i) {
			System.out.print(String.format("\033[%dm %3d\033[0m", i, i - 40));
		}
		System.out.println();
		System.out.println("终端3/4位8种明亮色");
		for (int i=100; i< 108; ++i) {
			System.out.print(String.format("\033[%dm %3d\033[0m", i, i - 100));
		}
		System.out.println();
		System.out.println("控制位测试: \033[32m 前景色32 空格\033[0m >>重置<< \033[36m 前景色36换行未重置");
		System.out.println("上一行未重置，继续前景色36");
		System.out.println("上一行未重置\033[0m 重置，前景色恢复默认");
		System.out.println("重置默认后的一行");
		System.out.println("line abcdefg 123456789");
		System.out.println(">>> \033[45;36m 背景色+前景色 123abcABC \033[0m <<<");
		System.out.println(">>> \033[1;36m 1: 粗体、加强 123abcABC \033[0m <<<");
		System.out.println(">>> \033[2;36m 2: 弱化（降低强度） 123abcABC \033[0m <<<");
		System.out.println(">>> \033[3;32m 3: 斜体 123abcABC \033[0m <<<");
		System.out.println(">>> \033[4;36m 4: 下划线 123abcABC \033[0m <<<");
		System.out.println(">>> \033[5;32m 5: 缓慢闪烁 123abcABC \033[0m <<<");
		System.out.println(">>> \033[6;36m 6: 快速闪烁 123abcABC \033[0m <<<");
		System.out.println(">>> \033[7m 7: 反色，前后色调换 123abcABC \033[0m <<<");
		System.out.println(">>> \033[8;36m 8: 隐藏 123abcABC \033[0m <<<--隐藏了");
		System.out.println(">>> \033[9;32m 9: 划线 123abcABC \033[0m <<<");
		System.out.println(">>> \033[53;35m 10: 上划线 123abcABC \033[0m <<<");
		System.out.println(">>> \033[4;9;53;33m 11: 上、下、中划线 123abcABC \033[0m <<<");
	}
}
