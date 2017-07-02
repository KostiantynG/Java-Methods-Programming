/**
 * # 8 # массивы и ссылки
 */

public class ArraysAndLinks {
    public static void main(String[] args) {
        int arRef[], ar; // объявление ссылки на массив и переменной
        float[] arRefFloat, arFloat; // два массива!
        // объявление с инициализацией нулевыми значениями по умолчанию
        int arDyn[] = new int[10]; // 10 нулей
        String str[] = new String[7]; // 7 null-ов
        /* объявление с инициализацией */
        int arInt[] = {5, 7, 9, -5, 6, -2}; // 6 элементов
        int arInt2[] = new int[]{5, 7, 9, -5, 6, -2}; // идентично предыдущему
        byte arByte[] = {1, 3, 5};// 3 элемента
        /* объявление с помощью ссылки на Object */
        Object arObj = new float[5]; // массив является объектом
        // допустимые присваивания ссылок
        arRef = arDyn;
        arDyn = arInt;
        arRefFloat = (float[]) arObj;
        arObj = arByte; // источник ошибки для следующей строки
        arRefFloat = (float[]) arObj; // ошибка выполнения
        // недопустимые присваивания ссылок (нековариантность)
        // arInt = arByte;
        // arInt = (int[ ])arByte;

        int arr[][] = {{1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 0}
        };
    }
}
