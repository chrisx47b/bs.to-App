package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.s */
/* compiled from: ViewModelStore */
public class C0319s {

    /* renamed from: a */
    private final HashMap<String, C0316q> f752a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1053a(String str, C0316q qVar) {
        C0316q qVar2 = (C0316q) this.f752a.put(str, qVar);
        if (qVar2 != null) {
            qVar2.mo1047a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0316q mo1051a(String str) {
        return (C0316q) this.f752a.get(str);
    }

    /* renamed from: a */
    public final void mo1052a() {
        for (C0316q a : this.f752a.values()) {
            a.mo1047a();
        }
        this.f752a.clear();
    }
}
