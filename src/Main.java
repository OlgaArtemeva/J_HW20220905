//2022-09-05
//        —----------------------------------------------------------------
//        Дана строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
//        “Java is a very popular language” ->  “Java language”


public class Main {
    public static void main(String[] args) {



        String str="Java is a very popular language";
        String lastWord = "";
        int numSign =0;
        int length = str.length();

        while (numSign<length){
            System.out.print(str.charAt(numSign));
            numSign+=1;
            if (str.charAt(numSign)==' ') {
                break;
            }
        }

        while (length>=0){
            lastWord = str.charAt(length-1) + lastWord;
            if (str.charAt(length-1)==' ') {
                break;
            }
            length-=1;
        }
        System.out.print(lastWord);

    }
}