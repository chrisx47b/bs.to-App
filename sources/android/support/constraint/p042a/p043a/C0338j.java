package android.support.constraint.p042a.p043a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.constraint.a.a.j */
/* compiled from: ConstraintWidgetGroup */
public class C0338j {

    /* renamed from: a */
    public List<C0335h> f1003a;

    /* renamed from: b */
    int f1004b = -1;

    /* renamed from: c */
    int f1005c = -1;

    /* renamed from: d */
    public boolean f1006d = false;

    /* renamed from: e */
    public final int[] f1007e = {this.f1004b, this.f1005c};

    /* renamed from: f */
    List<C0335h> f1008f = new ArrayList();

    /* renamed from: g */
    List<C0335h> f1009g = new ArrayList();

    /* renamed from: h */
    HashSet<C0335h> f1010h = new HashSet<>();

    /* renamed from: i */
    HashSet<C0335h> f1011i = new HashSet<>();

    /* renamed from: j */
    List<C0335h> f1012j = new ArrayList();

    /* renamed from: k */
    List<C0335h> f1013k = new ArrayList();

    C0338j(List<C0335h> list) {
        this.f1003a = list;
    }

    /* renamed from: a */
    public List<C0335h> mo1225a(int i) {
        if (i == 0) {
            return this.f1008f;
        }
        if (i == 1) {
            return this.f1009g;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Set<C0335h> mo1227b(int i) {
        if (i == 0) {
            return this.f1010h;
        }
        if (i == 1) {
            return this.f1011i;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1226a(C0335h hVar, int i) {
        if (i == 0) {
            this.f1010h.add(hVar);
        } else if (i == 1) {
            this.f1011i.add(hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1228b() {
        int size = this.f1013k.size();
        for (int i = 0; i < size; i++) {
            m1192a((C0335h) this.f1013k.get(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C0335h> mo1224a() {
        if (!this.f1012j.isEmpty()) {
            return this.f1012j;
        }
        int size = this.f1003a.size();
        for (int i = 0; i < size; i++) {
            C0335h hVar = (C0335h) this.f1003a.get(i);
            if (!hVar.f948ja) {
                m1193a((ArrayList) this.f1012j, hVar);
            }
        }
        this.f1013k.clear();
        this.f1013k.addAll(this.f1003a);
        this.f1013k.removeAll(this.f1012j);
        return this.f1012j;
    }

    C0338j(List<C0335h> list, boolean z) {
        this.f1003a = list;
        this.f1006d = z;
    }

    /* renamed from: a */
    private void m1193a(ArrayList<C0335h> arrayList, C0335h hVar) {
        if (!hVar.f952la) {
            arrayList.add(hVar);
            hVar.f952la = true;
            if (!hVar.mo1206y()) {
                if (hVar instanceof C0341m) {
                    C0341m mVar = (C0341m) hVar;
                    int i = mVar.f1025wa;
                    for (int i2 = 0; i2 < i; i2++) {
                        m1193a(arrayList, mVar.f1024va[i2]);
                    }
                }
                for (C0330f fVar : hVar.f907D) {
                    C0330f fVar2 = fVar.f877d;
                    if (fVar2 != null) {
                        C0335h hVar2 = fVar2.f875b;
                        if (!(fVar2 == null || hVar2 == hVar.mo1182k())) {
                            m1193a(arrayList, hVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1192a(android.support.constraint.p042a.p043a.C0335h r7) {
        /*
            r6 = this;
            boolean r0 = r7.f948ja
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r7.mo1206y()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            android.support.constraint.a.a.f r0 = r7.f973x
            android.support.constraint.a.a.f r0 = r0.f877d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            android.support.constraint.a.a.f r3 = r7.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            goto L_0x0021
        L_0x001d:
            android.support.constraint.a.a.f r3 = r7.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
        L_0x0021:
            if (r3 == 0) goto L_0x0045
            android.support.constraint.a.a.h r4 = r3.f875b
            boolean r5 = r4.f950ka
            if (r5 != 0) goto L_0x002c
            r6.m1192a(r4)
        L_0x002c:
            android.support.constraint.a.a.f$c r4 = r3.f876c
            android.support.constraint.a.a.f$c r5 = android.support.constraint.p042a.p043a.C0330f.C0333c.RIGHT
            if (r4 != r5) goto L_0x003c
            android.support.constraint.a.a.h r3 = r3.f875b
            int r4 = r3.f915L
            int r3 = r3.mo1198s()
            int r3 = r3 + r4
            goto L_0x0046
        L_0x003c:
            android.support.constraint.a.a.f$c r5 = android.support.constraint.p042a.p043a.C0330f.C0333c.LEFT
            if (r4 != r5) goto L_0x0045
            android.support.constraint.a.a.h r3 = r3.f875b
            int r3 = r3.f915L
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            android.support.constraint.a.a.f r0 = r7.f973x
            int r0 = r0.mo1119b()
            int r3 = r3 - r0
            goto L_0x005c
        L_0x0050:
            android.support.constraint.a.a.f r0 = r7.f971v
            int r0 = r0.mo1119b()
            int r4 = r7.mo1198s()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x005c:
            int r0 = r7.mo1198s()
            int r0 = r3 - r0
            r7.mo1138a(r0, r3)
            android.support.constraint.a.a.f r0 = r7.f975z
            android.support.constraint.a.a.f r0 = r0.f877d
            if (r0 == 0) goto L_0x0087
            android.support.constraint.a.a.h r1 = r0.f875b
            boolean r3 = r1.f950ka
            if (r3 != 0) goto L_0x0074
            r6.m1192a(r1)
        L_0x0074:
            android.support.constraint.a.a.h r0 = r0.f875b
            int r1 = r0.f916M
            int r0 = r0.f925V
            int r1 = r1 + r0
            int r0 = r7.f925V
            int r1 = r1 - r0
            int r0 = r7.f912I
            int r0 = r0 + r1
            r7.mo1171e(r1, r0)
            r7.f950ka = r2
            return
        L_0x0087:
            android.support.constraint.a.a.f r0 = r7.f974y
            android.support.constraint.a.a.f r0 = r0.f877d
            if (r0 == 0) goto L_0x008e
            r1 = 1
        L_0x008e:
            if (r1 == 0) goto L_0x0095
            android.support.constraint.a.a.f r0 = r7.f974y
            android.support.constraint.a.a.f r0 = r0.f877d
            goto L_0x0099
        L_0x0095:
            android.support.constraint.a.a.f r0 = r7.f972w
            android.support.constraint.a.a.f r0 = r0.f877d
        L_0x0099:
            if (r0 == 0) goto L_0x00bc
            android.support.constraint.a.a.h r4 = r0.f875b
            boolean r5 = r4.f950ka
            if (r5 != 0) goto L_0x00a4
            r6.m1192a(r4)
        L_0x00a4:
            android.support.constraint.a.a.f$c r4 = r0.f876c
            android.support.constraint.a.a.f$c r5 = android.support.constraint.p042a.p043a.C0330f.C0333c.BOTTOM
            if (r4 != r5) goto L_0x00b4
            android.support.constraint.a.a.h r0 = r0.f875b
            int r3 = r0.f916M
            int r0 = r0.mo1178i()
            int r3 = r3 + r0
            goto L_0x00bc
        L_0x00b4:
            android.support.constraint.a.a.f$c r5 = android.support.constraint.p042a.p043a.C0330f.C0333c.TOP
            if (r4 != r5) goto L_0x00bc
            android.support.constraint.a.a.h r0 = r0.f875b
            int r3 = r0.f916M
        L_0x00bc:
            if (r1 == 0) goto L_0x00c6
            android.support.constraint.a.a.f r0 = r7.f974y
            int r0 = r0.mo1119b()
            int r3 = r3 - r0
            goto L_0x00d2
        L_0x00c6:
            android.support.constraint.a.a.f r0 = r7.f972w
            int r0 = r0.mo1119b()
            int r1 = r7.mo1178i()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00d2:
            int r0 = r7.mo1178i()
            int r0 = r3 - r0
            r7.mo1171e(r0, r3)
            r7.f950ka = r2
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0338j.m1192a(android.support.constraint.a.a.h):void");
    }
}
