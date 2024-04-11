# Используем официальный образ Maven с Java 11 как базовый образ
FROM maven:3.8.1-openjdk-11 as build

# Устанавливаем рабочую директорию в /app
WORKDIR /app

# Копируем pom.xml в рабочую директорию
COPY pom.xml .

# Копируем исходный код в рабочую директорию
COPY src ./src

# Собираем приложение
RUN mvn clean package

# Используем официальный образ OpenJDK 11 JRE для запуска приложения
FROM openjdk:11-jre-slim

# Копируем собранный jar-файл в контейнер
COPY --from=build /app/target/ThymeleafProject-0.0.1-SNAPSHOT.jar app.jar

# Копируем application.properties в контейнер
COPY src/main/resources/application.properties application.properties

# Открываем порт 8443
EXPOSE 8080

# Запускаем приложение
CMD ["java", "-jar", "app.jar"]