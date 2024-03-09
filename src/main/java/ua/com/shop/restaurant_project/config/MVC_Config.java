/*
Цей код належить до класу конфігурації Spring для веб-проекту.
Клас MVC_Config є конфігураційним класом, що імплементує інтерфейс WebMvcConfigurer.
Цей інтерфейс дозволяє налаштувати конфігурацію Spring MVC для веб-проекту.

Метод addResourceHandlers в даному коді встановлює налаштування ресурсів,
тобто визначає, як будуть доступні статичні ресурси в проекті (наприклад, зображення,
CSS-файли, JavaScript-файли тощо).

У даному випадку, метод addResourceHandlers налаштовує локацію статичних ресурсів
нашого проекту на каталог classpath:/static/ та прив'язує їх до шляху /static/** у веб-додатку.

Тобто, якщо, наприклад, у нашому проекті є статичний файл styles.css, що розташований
у каталозі src/main/resources/static/, то ми можемо отримати до нього доступ за допомогою
URL-адреси /static/styles.css.

Отже, дана конфігурація дозволить належним чином використовувати статичні ресурси в нашому веб-додатку.
*/
package ua.com.shop.restaurant_project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVC_Config implements WebMvcConfigurer
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry reg)
    {
        reg.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}