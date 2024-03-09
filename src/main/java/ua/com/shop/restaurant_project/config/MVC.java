/*
Даний код належить до класу конфігурації Spring для веб-проекту.

В даному випадку, клас MVC є конфігураційним класом, що імплементує
інтерфейс WebMvcConfigurer. Цей інтерфейс дозволяє налаштувати конфігурацію
Spring MVC для веб-проекту.

У методі addViewControllers класу MVC, через об'єкт registry,
виконуються налаштування контролерів (view controllers), які
будуть відповідати за відображення сторінок нашого проекту.
Наприклад, у даному коді, ми створюємо три контролери: /login, /info та /manager,
які будуть відповідати за відображення сторінок з назвами login, info та manager відповідно.

Таким чином, клас MVC містить конфігураційні налаштування для веб-проекту,
які дозволять належним чином відображати відповідні сторінки за URL-адресами,
які ми встановлюємо у методі addViewControllers.
*/
package ua.com.shop.restaurant_project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVC implements WebMvcConfigurer
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("/login").setViewName("login");

    }
}