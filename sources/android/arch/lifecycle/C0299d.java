package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.d */
/* compiled from: Lifecycle */
public abstract class C0299d {

    /* renamed from: android.arch.lifecycle.d$a */
    /* compiled from: Lifecycle */
    public enum C0300a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: android.arch.lifecycle.d$b */
    /* compiled from: Lifecycle */
    public enum C0301b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo1030a(C0301b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract C0301b mo1027a();

    /* renamed from: a */
    public abstract void mo1028a(C0302e eVar);

    /* renamed from: b */
    public abstract void mo1029b(C0302e eVar);
}
