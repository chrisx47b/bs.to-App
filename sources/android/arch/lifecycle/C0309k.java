package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.k */
/* compiled from: LiveData */
class C0309k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LiveData f747a;

    C0309k(LiveData liveData) {
        this.f747a = liveData;
    }

    public void run() {
        Object b;
        synchronized (this.f747a.f702b) {
            b = this.f747a.f706f;
            this.f747a.f706f = LiveData.f701a;
        }
        this.f747a.mo1013a(b);
    }
}
