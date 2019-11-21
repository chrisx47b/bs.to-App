package android.arch.lifecycle;

import android.arch.lifecycle.C0299d.C0300a;
import android.arch.lifecycle.C0299d.C0301b;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p000a.p001a.p002a.p004b.C0005a;

/* renamed from: android.arch.lifecycle.h */
/* compiled from: LifecycleRegistry */
public class C0305h extends C0299d {

    /* renamed from: a */
    private C0005a<C0302e, C0306a> f736a = new C0005a<>();

    /* renamed from: b */
    private C0301b f737b;

    /* renamed from: c */
    private final WeakReference<C0303f> f738c;

    /* renamed from: d */
    private int f739d = 0;

    /* renamed from: e */
    private boolean f740e = false;

    /* renamed from: f */
    private boolean f741f = false;

    /* renamed from: g */
    private ArrayList<C0301b> f742g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.h$a */
    /* compiled from: LifecycleRegistry */
    static class C0306a {

        /* renamed from: a */
        C0301b f743a;

        /* renamed from: b */
        GenericLifecycleObserver f744b;

        C0306a(C0302e eVar, C0301b bVar) {
            this.f744b = C0308j.m992a((Object) eVar);
            this.f743a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1034a(C0303f fVar, C0300a aVar) {
            C0301b a = C0305h.m973a(aVar);
            this.f743a = C0305h.m974a(this.f743a, a);
            this.f744b.mo1004a(fVar, aVar);
            this.f743a = a;
        }
    }

    public C0305h(C0303f fVar) {
        this.f738c = new WeakReference<>(fVar);
        this.f737b = C0301b.INITIALIZED;
    }

    /* renamed from: c */
    private void m981c(C0301b bVar) {
        if (this.f737b != bVar) {
            this.f737b = bVar;
            if (this.f740e || this.f739d != 0) {
                this.f741f = true;
                return;
            }
            this.f740e = true;
            m982d();
            this.f740e = false;
        }
    }

    /* renamed from: d */
    private void m983d(C0301b bVar) {
        this.f742g.add(bVar);
    }

    /* renamed from: e */
    private static C0300a m984e(C0301b bVar) {
        int i = C0304g.f735b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0300a.ON_START;
            }
            if (i == 3) {
                return C0300a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return C0300a.ON_CREATE;
    }

    /* renamed from: a */
    public void mo1032a(C0301b bVar) {
        m981c(bVar);
    }

    /* renamed from: b */
    public void mo1033b(C0300a aVar) {
        m981c(m973a(aVar));
    }

    /* renamed from: d */
    private void m982d() {
        C0303f fVar = (C0303f) this.f738c.get();
        if (fVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m978b()) {
            this.f741f = false;
            if (this.f737b.compareTo(((C0306a) this.f736a.mo12a().getValue()).f743a) < 0) {
                m975a(fVar);
            }
            Entry c = this.f736a.mo14c();
            if (!this.f741f && c != null && this.f737b.compareTo(((C0306a) c.getValue()).f743a) > 0) {
                m977b(fVar);
            }
        }
        this.f741f = false;
    }

    /* renamed from: a */
    public void mo1028a(C0302e eVar) {
        C0301b bVar = this.f737b;
        C0301b bVar2 = C0301b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0301b.INITIALIZED;
        }
        C0306a aVar = new C0306a(eVar, bVar2);
        if (((C0306a) this.f736a.mo7b(eVar, aVar)) == null) {
            C0303f fVar = (C0303f) this.f738c.get();
            if (fVar != null) {
                boolean z = this.f739d != 0 || this.f740e;
                C0301b c = m979c(eVar);
                this.f739d++;
                while (aVar.f743a.compareTo(c) < 0 && this.f736a.contains(eVar)) {
                    m983d(aVar.f743a);
                    aVar.mo1034a(fVar, m984e(aVar.f743a));
                    m980c();
                    c = m979c(eVar);
                }
                if (!z) {
                    m982d();
                }
                this.f739d--;
            }
        }
    }

    /* renamed from: b */
    private boolean m978b() {
        boolean z = true;
        if (this.f736a.size() == 0) {
            return true;
        }
        C0301b bVar = ((C0306a) this.f736a.mo12a().getValue()).f743a;
        C0301b bVar2 = ((C0306a) this.f736a.mo14c().getValue()).f743a;
        if (!(bVar == bVar2 && this.f737b == bVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public void mo1029b(C0302e eVar) {
        this.f736a.remove(eVar);
    }

    /* renamed from: b */
    private static C0300a m976b(C0301b bVar) {
        int i = C0304g.f735b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0300a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0300a.ON_STOP;
            }
            if (i == 4) {
                return C0300a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    private C0301b m979c(C0302e eVar) {
        Entry b = this.f736a.mo8b(eVar);
        C0301b bVar = null;
        C0301b bVar2 = b != null ? ((C0306a) b.getValue()).f743a : null;
        if (!this.f742g.isEmpty()) {
            ArrayList<C0301b> arrayList = this.f742g;
            bVar = (C0301b) arrayList.get(arrayList.size() - 1);
        }
        return m974a(m974a(this.f737b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m980c() {
        ArrayList<C0301b> arrayList = this.f742g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: b */
    private void m977b(C0303f fVar) {
        C0011d b = this.f736a.mo13b();
        while (b.hasNext() && !this.f741f) {
            Entry entry = (Entry) b.next();
            C0306a aVar = (C0306a) entry.getValue();
            while (aVar.f743a.compareTo(this.f737b) < 0 && !this.f741f && this.f736a.contains(entry.getKey())) {
                m983d(aVar.f743a);
                aVar.mo1034a(fVar, m984e(aVar.f743a));
                m980c();
            }
        }
    }

    /* renamed from: a */
    public C0301b mo1027a() {
        return this.f737b;
    }

    /* renamed from: a */
    static C0301b m973a(C0300a aVar) {
        switch (C0304g.f734a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0301b.CREATED;
            case 3:
            case 4:
                return C0301b.STARTED;
            case 5:
                return C0301b.RESUMED;
            case 6:
                return C0301b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m975a(C0303f fVar) {
        Iterator descendingIterator = this.f736a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f741f) {
            Entry entry = (Entry) descendingIterator.next();
            C0306a aVar = (C0306a) entry.getValue();
            while (aVar.f743a.compareTo(this.f737b) > 0 && !this.f741f && this.f736a.contains(entry.getKey())) {
                C0300a b = m976b(aVar.f743a);
                m983d(m973a(b));
                aVar.mo1034a(fVar, b);
                m980c();
            }
        }
    }

    /* renamed from: a */
    static C0301b m974a(C0301b bVar, C0301b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
