public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Иванов И.Н.", 1, "Химический", "01.01.1990", "+7(111)111-11-11");
        readers[1] = new Reader("Петров В.В.", 2, "Механический", "02.02.1991", "+7(222)222-22-22");
        readers[2] = new Reader("Сидоров С.Д.", 3, "Электротехнический", "03.03.1992", "+7(333)333-33-33");
        readers[3] = new Reader("Дудоров К.М.", 4, "Информационных технологий", "19.03.2005", "+7(903)835-95-28");
        readers[4] = new Reader("Табаргин А.Н.", 5, "Железнодорожный", "14.04.2005", "+7(995)727-74-42");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[3].returnBook(3);
        readers[4].returnBook("Приключения", "Словарь", "Энциклопедия");
    }
}
