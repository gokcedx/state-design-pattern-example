# state-design-pattern-example
State tasarım kalıbı java örneği


State tasarım kalıbında, bir durum belirlenirken önceki durumun devamlı kontrol edilmesine gerek kalmaz. Çünkü state olarak önceki durum tutulur ve yeni durumda yapılması gerekenler buna göre belirlenir.


Bu örnekte; telefonun açık olma durumu, arama durumu ve kapalı olma durumunu ele aldık. Telefon açık olduğunda tekrar açılmayacak, kapalı olduğu durumda arama yapılmayacak ve telefon kapalıysa tekrar kapanmayacak. Telefonun aldığı tüm durumları anlık olarak state içinde tutarak yeni durumu belirlemiş olacağız. 


State tasarım kalıbı kullanılmadan yapılan örnek: "TelefonDurumuEskiHali" - Burada eski durum tutulmadığı için çok fazla kontrol gerekecektir.
