package android.arch.lifecycle;

import android.arch.lifecycle.C0299d.C0300a;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f700a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f700a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo1004a(C0303f fVar, C0300a aVar) {
        switch (C0297b.f727a[aVar.ordinal()]) {
            case 1:
                this.f700a.mo1008d(fVar);
                return;
            case 2:
                this.f700a.mo1005a(fVar);
                return;
            case 3:
                this.f700a.mo1009e(fVar);
                return;
            case 4:
                this.f700a.mo1006b(fVar);
                return;
            case 5:
                this.f700a.mo1010f(fVar);
                return;
            case 6:
                this.f700a.mo1007c(fVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
