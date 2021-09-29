import java.util.Scanner;

/**
 * Project name(项目名称)：第一次实验 实验3
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 22:53
 * Version(版本): 1.0
 * Description(描述)： 要求：判断一个数组中是否存在相同的元素，如果存在相同的元素则输出“重复”，否则输出“不重复”。
 * 该题中如果需要判断数组中元素是否重复，则需要对数组中的元素进行两两比较，如果有任意一组元素相等，则该数组中的元素存在重复，
 * 如果任意一组元素都不想等，则表示数组中的元素不重复。
 * 实现思路：假设数组中的元素不重复，两两比较数组中的元素，使用数组中的第一个元素和后续所有元素比较，
 * 接着使用数组中的第二个元素和后续元素比较，依次类推实现两两比较，如果有一组元素相同，则数组中存储重复，结束循环。
 * 把比较的结果存储在一个标志变量里，最后判断标志变量的值即可。
 */

public class test
{
    public static void main(String[] args)
    {
        int[] arrays = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5个数:");
        for (int i = 0; i < 5; i++)
        {
            arrays[i] = input.nextInt();
        }
        System.out.println("数组如下：");
        for (int i : arrays)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        int a;
        int b;
        boolean result = false;
        end:
        for (int i = 0; i < arrays.length - 1; i++)
        {
            a = arrays[i];
            for (int j = i + 1; j < arrays.length; j++)
            {
                b = arrays[j];
                if (a == b)
                {
                    result = true;
                    System.err.println("存在相同的元素");
                    break end;
                }
            }
        }
        if (!result)
        {
            System.out.println("不存在相同的元素");
        }
    }
}
