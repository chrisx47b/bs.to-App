package android.arch.lifecycle;

import android.arch.lifecycle.C0299d.C0300a;
import android.arch.lifecycle.C0299d.C0301b;
import java.util.Map.Entry;
import p000a.p001a.p002a.p003a.C0002c;
import p000a.p001a.p002a.p004b.C0007c;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f701a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f702b = new Object();

    /* renamed from: c */
    private C0007c<C0312n<T>, C0293a> f703c = new C0007c<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f704d = 0;

    /* renamed from: e */
    private volatile Object f705e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Object f706f;

    /* renamed from: g */
    private int f707g;

    /* renamed from: h */
    private boolean f708h;

    /* renamed from: i */
    private boolean f709i;

    /* renamed from: j */
    private final Runnable f710j;

    class LifecycleBoundObserver extends C0293a implements GenericLifecycleObserver {

        /* renamed from: e */
        final C0303f f711e;

        LifecycleBoundObserver(C0303f fVar, C0312n<T> nVar) {
            super(nVar);
            this.f711e = fVar;
        }

        /* renamed from: a */
        public void mo1004a(C0303f fVar, C0300a aVar) {
            if (this.f711e.mo1031a().mo1027a() == C0301b.DESTROYED) {
                LiveData.this.mo1012a(this.f713a);
            } else {
                mo1019a(mo1018b());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1018b() {
            return this.f711e.mo1031a().mo1027a().mo1030a(C0301b.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1017a(C0303f fVar) {
            return this.f711e == fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1016a() {
            this.f711e.mo1031a().mo1029b(this);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0293a {

        /* renamed from: a */
        final C0312n<T> f713a;

        /* renamed from: b */
        boolean f714b;

        /* renamed from: c */
        int f715c = -1;

        C0293a(C0312n<T> nVar) {
            this.f713a = nVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1016a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1019a(boolean z) {
            if (z != this.f714b) {
                this.f714b = z;
                int i = 1;
                boolean z2 = LiveData.this.f704d == 0;
                LiveData liveData = LiveData.this;
                int c = liveData.f704d;
                if (!this.f714b) {
                    i = -1;
                }
                liveData.f704d = c + i;
                if (z2 && this.f714b) {
                    LiveData.this.mo1014b();
                }
                if (LiveData.this.f704d == 0 && !this.f714b) {
                    LiveData.this.mo1015c();
                }
                if (this.f714b) {
                    LiveData.this.m942b(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1017a(C0303f fVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo1018b();
    }

    public LiveData() {
        Object obj = f701a;
        this.f705e = obj;
        this.f706f = obj;
        this.f707g = -1;
        this.f710j = new C0309k(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1014b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1015c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m942b(C0293a aVar) {
        if (this.f708h) {
            this.f709i = true;
            return;
        }
        this.f708h = true;
        do {
            this.f709i = false;
            if (aVar == null) {
                C0011d b = this.f703c.mo13b();
                while (b.hasNext()) {
                    m938a((C0293a) ((Entry) b.next()).getValue());
                    if (this.f709i) {
                        break;
                    }
                }
            } else {
                m938a(aVar);
                aVar = null;
            }
        } while (this.f709i);
        this.f708h = false;
    }

    /* renamed from: a */
    private void m938a(C0293a aVar) {
        if (aVar.f714b) {
            if (!aVar.mo1018b()) {
                aVar.mo1019a(false);
                return;
            }
            int i = aVar.f715c;
            int i2 = this.f707g;
            if (i < i2) {
                aVar.f715c = i2;
                aVar.f713a.mo1036a(this.f705e);
            }
        }
    }

    /* renamed from: a */
    public void mo1011a(C0303f fVar, C0312n<T> nVar) {
        if (fVar.mo1031a().mo1027a() != C0301b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(fVar, nVar);
            C0293a aVar = (C0293a) this.f703c.mo7b(nVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.mo1017a(fVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                fVar.mo1031a().mo1028a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo1012a(C0312n<T> nVar) {
        m940a("removeObserver");
        C0293a aVar = (C0293a) this.f703c.remove(nVar);
        if (aVar != null) {
            aVar.mo1016a();
            aVar.mo1019a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1013a(T t) {
        m940a("setValue");
        this.f707g++;
        this.f705e = t;
        m942b(null);
    }

    /* renamed from: a */
    private static void m940a(String str) {
        if (!C0002c.m0b().mo4a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
