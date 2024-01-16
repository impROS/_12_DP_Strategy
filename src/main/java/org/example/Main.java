package org.example;
/*
* Strateji Tasarım Deseni, genellikle aşağıdaki durumlar için uygundur:

    Algoritmanın Değişmesi: Bir algoritma ailesine sahipsiniz ve bu algoritmaların müşteri tarafından seçilebilir olması
    *  veya değiştirilebilir olması gerekiyorsa. Strateji deseni, algoritmanın değişebilir olduğu durumlar için uygundur.

    Birden Fazla Benzer Davranış: Bir sınıfın birden fazla benzer davranışa sahip olması durumunda. Bu durumda,
    *  her davranış için ayrı bir strateji uygulanabilir ve bu stratejiler daha sonra kolayca değiştirilebilir.

    Kodun Temiz ve Bakımı Kolay Hale Getirilmesi: Strateji deseni, kodun temiz ve bakımı kolay olmasını sağlar.
    *  Algoritmaları ve stratejileri birbirinden ayrı sınıflara bölmek, her sınıfı tek bir sorumluluğa sahip olacak
    *  şekilde tasarlamak, kodu anlaşılır ve bakımı kolay hale getirir.

    Ayrıştırılmış Sorumluluklar: Strateji deseni, ayrıştırılmış sorumlulukları destekler. Belirli bir sınıf içinde
    * çok sayıda koşul ifadesi veya daldırma olmadan, her strateji kendi sınıfında tutulabilir.

    Kodu Genişletilebilir Kılmak: Yeni algoritmaların eklenmesi veya mevcut algoritmaların değiştirilmesi gereken
    *  durumlar için genişletilebilir bir yapı sağlar.

    Çoklu Durumlar ve Koşullalardan Kaçınma: Bir nesnenin durumu veya davranışı çok sayıda duruma bağlıysa ve
    * bu durumları if-else veya switch-case gibi yapılarla yönetmek karmaşık hale geliyorsa, Strateji Deseni
    * bu durumu yönetmek için kullanılabilir.

Strateji deseni, özellikle algoritmaların veya davranışların değişebilir olduğu durumlar için esneklik sağlar ve
*  kodun daha modüler, bakımı kolay ve genişletilebilir olmasına yardımcı olur.
* */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Kredi Kartı ile ödeme stratejisi
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9101-1121");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // PayPal ile ödeme stratejisi
        PaymentStrategy payPalPayment = new PayPalPayment("example@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}