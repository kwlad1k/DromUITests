package tests;

import com.github.javafaker.Faker;
import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;

public class TestData {

    Faker faker = new Faker();

    AuthConfig authConfig = ConfigFactory.create(AuthConfig.class);

    public String regionName = faker.options().option("Алтайский край", "Амурская область", "Архангельская область",
            "Астраханская область", "Белгородская область", "Брянская область", "Владимирская область", "Волгоградская область",
            "Вологодская область", "Воронежская область", "Еврейская автономкая область", "Ивановская область",
            "Иркутская область", "Кабардино-Балкарская Республика", "Калининградская область", "Калужская область", "Камчатский Край",
            "Карачаево-Черкассекая Республика", "Кемеровская область", "Кировская область", "Костромская область", "Краснодарский край",
            "Красноярский край", "Курганская область", "Курская область", "Ленинградская область", "Липецкая область", "Магаданская область",
            "Москва", "Московская область", "Мурманская область", "Нижегородская область", "Новгородская область",
            "Новосибирская область", "Омская область", "Оренбургская область", "Орловская область", "Пензенская область", "Пермский край",
            "Приморский край", "Псковская область", "Республика Адыгея", "Республика Алтай", "Республика Башкортостан", "Республика Бурятия",
            "Республика Ингушетия", "Республика Калмыкия", "Республика Карелия", "Республика Коми", "Республика Крым",
            "Республика Марий Эл", "Республика Мордовия", "Республика Саха (Якутия)", "Республика Татарастан", "Республика Тыва", "Республика Хакасия",
            "Ростовская область", "Рязанская область", "Самарская область", "Санкт-Петербург", "Саратовская область", "Сахалинская область",
            "Свердловская область", "Смоленская область", "Ставропольский край", "Тамбовская область", "Тверская область", "Томская область",
            "Тульская область", "Тюменская область", "Удмуртская область", "Ульяновская область", "Хабаровский край",
            "Челябинская область", "Чеченская область", "Чувашская область", "Ярославская область"),
            userName = authConfig.userName(),
            userPassword = authConfig.password(),
            randomEmail = faker.internet().emailAddress(),
            randomPassword = faker.internet().password(),
            registrationNumberAuto = faker.options().option("Р145АУ198", "Х309РМ55", "А302ХС790"),
            randomCarModel = faker.options().option("BMW", "Audi", "Toyota", "Tank", "EXEED", "Geely");

}
