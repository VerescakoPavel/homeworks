package homework.lesson26.task1;

/*
1) Создатйте enum "Тип пользователя" с вариантами констант: USER, ADMIN
1) Необходимо создать класс "Человек", добавить в него поле "Тип пользователя" с енамом, остальные поля придумайте самостоятельно
2) Создать интерфейс Фильтр. В него добавьте метод, который принимает строку (веб-адрес, к которому подключается человек)
 и тип пользователя (enum). Метод отдает boolean значение, пропускает ли он человека к ресурсу или нет.
3) Реализуйте интерфейс таким образом:
3.1) Если это админ, то досту разрещен к любому сайту
3.2) Если это пользователь, то ему разрешен доступ только к сайтам, которые начинаются на "http://web-for-user"
4) Самостоятельно создайте пару пользователей и попробуйте проверить, к каким сайтам у них есть доступ


5*) Добавьте в enum поле, обозначающее название роли пользователя на русском языке
 */
public class Main {

    public static void main(String[] args) {

        Person pavel = new Person("Pavel", 30, UserType.ADMIN);
        Person nadja = new Person("Nadja", 35, UserType.USER);

        String[] urls = {"http://web-for-user.com",
                "https://google.ru",
                "http://web-for-user.net",
                "https://lms.ait-tr.eu"
        };

        Filter filter = new AccessFilter();

        for (int i = 0; i < urls.length; i++) {
            System.out.println("Access for " + pavel.getName() + " to " + urls[i] + " is " + (filter.accessAllowance(urls[i], pavel.getUserType()) ? "allowed" : "denied"));
            System.out.println("Access for " + nadja.getName() + " to " + urls[i] + " is " + (filter.accessAllowance(urls[i], nadja.getUserType()) ? "allowed" : "denied"));

        }
    }
}
