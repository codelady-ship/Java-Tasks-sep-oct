package Lessons.Lesson17.Generics.Optional;

import java.lang.ref.SoftReference;

//referanslar Garbage Collection ilə əlaqəli
public class Referances {
    static void main() {
        //strong references
        Card card = new Card();

        //Soft referance heapa baxr dolanda avtomatic silecek.Yaddaş azalıbsa silinir
        //Keş (cache) obyektləri üçün çox istifadə olunur.
        SoftReference <Card> softReference = new SoftReference<>(card);
        Card card2 = new Card();

        //Weak -WeakHashMap kimi strukturlar üçün istifadə olunur.
        //WeakReference<MyObject> weakRef = new WeakReference<>(new MyObject());

       //PhantomReference<MyObject> phantomRef = new PhantomReference<>(new MyObject(), referenceQueue);
       //Obyekt silinməzdən əvvəl müəyyən təmizləmə (cleanup) əməliyyatları aparmaq.
        //phantomRef.get() həmişə null qaytarır.
    }
}
