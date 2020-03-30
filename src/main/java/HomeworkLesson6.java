public class HomeworkLesson6 {
    public static void main(String[] args){
        String[] w = { " Быстрее "," бы "," закончился "," этот "," ужасный "," карантин "};
        System.out.print("Выводим строку: ");
        for(int i=0; i<w.length; i++){
            System.out.print(w[i]);
        }
        System.out.println();

        int k = w.length;
        //Переменная, которую используем при обмене элементов
        String change;
        for(int i = 0; i < k/2; i++) {
            change = w[k-i-1];
            w[k-i-1] = w[i];
            w[i] = change;
        }
        System.out.print("Выводим строку в обратном порядке: ");
        for(int i=0; i<w.length; i++){
            System.out.print(w[i]);
        }
    }
}
