package android.arch.lifecycle;

import android.arch.lifecycle.C0299d.C0300a;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0298c[] f699a;

    CompositeGeneratedAdaptersObserver(C0298c[] cVarArr) {
        this.f699a = cVarArr;
    }

    /* renamed from: a */
    public void mo1004a(C0303f fVar, C0300a aVar) {
        C0310l lVar = new C0310l();
        for (C0298c a : this.f699a) {
            a.mo1026a(fVar, aVar, false, lVar);
        }
        for (C0298c a2 : this.f699a) {
            a2.mo1026a(fVar, aVar, true, lVar);
        }
    }
}
