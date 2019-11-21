package android.support.constraint.p042a.p043a;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.a.a.r */
/* compiled from: ResolutionNode */
public class C0346r {

    /* renamed from: a */
    HashSet<C0346r> f1041a = new HashSet<>(2);

    /* renamed from: b */
    int f1042b = 0;

    /* renamed from: a */
    public void mo1251a(C0346r rVar) {
        this.f1041a.add(rVar);
    }

    /* renamed from: b */
    public void mo1252b() {
        this.f1042b = 0;
        Iterator it = this.f1041a.iterator();
        while (it.hasNext()) {
            ((C0346r) it.next()).mo1252b();
        }
    }

    /* renamed from: c */
    public boolean mo1253c() {
        return this.f1042b == 1;
    }

    /* renamed from: d */
    public void mo1243d() {
        this.f1042b = 0;
        this.f1041a.clear();
    }

    /* renamed from: e */
    public void mo1244e() {
    }

    /* renamed from: a */
    public void mo1250a() {
        this.f1042b = 1;
        Iterator it = this.f1041a.iterator();
        while (it.hasNext()) {
            ((C0346r) it.next()).mo1244e();
        }
    }
}
