package android.arch.lifecycle;

import android.arch.lifecycle.C0299d.C0300a;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f717a;

    /* renamed from: b */
    private final C0295a f718b = C0294a.f720a.mo1020a(this.f717a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f717a = obj;
    }

    /* renamed from: a */
    public void mo1004a(C0303f fVar, C0300a aVar) {
        this.f718b.mo1022a(fVar, aVar, this.f717a);
    }
}
