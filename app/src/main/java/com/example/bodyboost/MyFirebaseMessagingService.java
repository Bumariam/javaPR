package com.example.bodyboost;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);

        // Здесь вы получите токен FCM
        // Вы можете отправить его на ваш сервер или сохранить для дальнейшего использования
        // Например:
        sendTokenToServer(token);
    }

    private void sendTokenToServer(String token) {
        // Отправка токена на ваш сервер
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        // Обработка полученного уведомления
        if (remoteMessage.getNotification() != null) {
            // Получение данных из уведомления
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();

            // Ваш код для обработки уведомления
            // Например, отображение уведомления в системной панели или выполнение дополнительных действий
        }
    }
}
