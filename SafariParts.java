public class SafariParts {

    public static void main(String[] args) {
        // Имитация данных о запчастях (в реальном коде они бы хранились в базе данных)
        String[][] parts = {
                {"Двигатель", "images/png-clipart-ferrari-458-car-ferrari-488-ferrari-s-p-a-ferrari-car-auto-part.jpg"},
                {"Трансмиссия", "images/i.jpg"},
                {"Кузов", "images/1663973414_new_preview_png-transparent-2014-ferrari-458-italia-2012-ferrari-458-italia-2015-ferrari-458-italia-2015-ferrari-458-spider-2014-ferrari-458-spider-ferrari-s-driving-car-performance-car.jpg"},
                {"Подвеска", "images/cafa2c7d6fc648218c99c1a3d16e56e1.jpg"}
        };

        // Вывод HTML-кода на консоль
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html lang=\"ru\">");
        System.out.println("<head>");
        System.out.println("    <meta charset=\"UTF-8\">");
        System.out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        System.out.println("    <title>Safari Parts - Запчасти для автомобилей</title>");
        System.out.println("    <link rel=\"stylesheet\" href=\"style.css\">");
        System.out.println("</head>");
        System.out.println("<body>");

        // Вывод header
        System.out.println("    <header>");
        System.out.println("        <h1>Safari Parts</h1>");
        System.out.println("        <nav>");
        System.out.println("            <ul>");
        System.out.println("                <li><a href=\"#\">О нас</a></li>");
        System.out.println("                <li><a href=\"#\">Каталог</a></li>");
        System.out.println("                <li><a href=\"#\">Контакты</a></li>");
        System.out.println("            </ul>");
        System.out.println("        </nav>");
        System.out.println("    </header>");

        // Вывод main
        System.out.println("    <main>");

        // Вывод hero
        System.out.println("        <section class=\"hero\">");
        System.out.println("            <div class=\"hero-content\">");
        System.out.println("                <h2>Запчасти для вашего автомобиля</h2>");
        System.out.println("                <p>Найдите все необходимые запчасти для вашего автомобиля, от двигателя до кузова.</p>");
        System.out.println("                <button>Узнать больше</button>");
        System.out.println("            </div>");
        System.out.println("            <div class=\"hero-image\">");
        System.out.println("            </div>");
        System.out.println("        </section>");

        // Вывод категорий
        System.out.println("        <section class=\"categories\">");
        System.out.println("            <h2>Наши категории</h2>");
        System.out.println("            <div class=\"category-grid\">");

        // Цикл для вывода каждой категории
        for (String[] part : parts) {
            System.out.println("                <div class=\"category\">");
            System.out.println("                    <img src=\"" + part[1] + "\" alt=\"" + part[0] + "\">");
            System.out.println("                    <h3>" + part[0] + "</h3>");
            System.out.println("                </div>");
        }

        System.out.println("            </div>");
        System.out.println("        </section>");

        // Вывод about
        System.out.println("        <section class=\"about\">");
        System.out.println("            <h2>О нас</h2>");
        System.out.println("            <p>Safari Parts - компания, специализирующаяся на продаже запчастей для автомобилей Safari. Мы предлагаем широкий ассортимент высококачественных запчастей по доступным ценам. Наша команда опытных специалистов всегда готова помочь вам найти нужные запчасти и обеспечить качественное обслуживание.</p>");
        System.out.println("        </section>");

        // Вывод contacts
        System.out.println("        <section class=\"contacts\">");
        System.out.println("            <h2>Контакты</h2>");
        System.out.println("            <p>Телефон: +7-924-255-98-76, +7-984-150-73-00</p>");
        System.out.println("            <p>Email: info@safariparts.ru</p>");
        System.out.println("            <p>Адрес: с.Голубовка ул. Партизанская 1Б</p>");
        System.out.println("        </section>");

        System.out.println("    </main>");

        // Вывод footer
        System.out.println("    <footer>");
        System.out.println("        <p>&copy; 2024 Safari Parts</p>");
        System.out.println("    </footer>");

        System.out.println("</body>");
        System.out.println("</html>");
    }
}