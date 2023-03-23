
public class Reader {
    private String ФИО;
    private int НомерБил;
    private String Факультет;
    private String ДатаРожд;
    private String Телефон;

    public Reader(String ФИО, int НомерБил, String Факультет, String ДатаРожд, String Телефон) {
        this.ФИО = ФИО;
        this.НомерБил = НомерБил;
        this.Факультет = Факультет;
        this.ДатаРожд = ДатаРожд;
        this.Телефон = Телефон;
    }

    public void takeBook(int Количество) {

        System.out.println(ФИО + " взял " + Количество + " книги");
    }

    public void takeBook(String... НазвКниги) {
        System.out.print(ФИО + " взял книги: ");
        for (String book : НазвКниги) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(int Количество) {

        System.out.println(ФИО + " вернул " + Количество + " книги");
    }

    public void returnBook(String... НазвКниги) {
        System.out.print(ФИО + " вернул книги: ");
        for (String book : НазвКниги) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
}