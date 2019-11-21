package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.r */
/* compiled from: ViewModelProvider */
public class C0317r {

    /* renamed from: a */
    private final C0318a f750a;

    /* renamed from: b */
    private final C0319s f751b;

    /* renamed from: android.arch.lifecycle.r$a */
    /* compiled from: ViewModelProvider */
    public interface C0318a {
        /* renamed from: a */
        <T extends C0316q> T mo1050a(Class<T> cls);
    }

    public C0317r(C0319s sVar, C0318a aVar) {
        this.f750a = aVar;
        this.f751b = sVar;
    }

    /* renamed from: a */
    public <T extends C0316q> T mo1048a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo1049a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0316q> T mo1049a(String str, Class<T> cls) {
        T a = this.f751b.mo1051a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f750a.mo1050a(cls);
        this.f751b.mo1053a(str, a2);
        return a2;
    }
}
