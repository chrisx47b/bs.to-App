package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0351c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.t */
/* compiled from: WidgetContainer */
public class C0349t extends C0335h {

    /* renamed from: va */
    protected ArrayList<C0335h> f1053va = new ArrayList<>();

    /* renamed from: D */
    public void mo1132D() {
        this.f1053va.clear();
        super.mo1132D();
    }

    /* renamed from: H */
    public void mo1134H() {
        super.mo1134H();
        ArrayList<C0335h> arrayList = this.f1053va;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0335h hVar = (C0335h) this.f1053va.get(i);
                hVar.mo1154b(mo1174g(), mo1176h());
                if (!(hVar instanceof C0337i)) {
                    hVar.mo1134H();
                }
            }
        }
    }

    /* renamed from: J */
    public C0337i mo1229J() {
        C0335h k = mo1182k();
        C0337i iVar = this instanceof C0337i ? (C0337i) this : null;
        while (k != null) {
            C0335h k2 = k.mo1182k();
            if (k instanceof C0337i) {
                iVar = (C0337i) k;
            }
            k = k2;
        }
        return iVar;
    }

    /* renamed from: K */
    public void mo1208K() {
        mo1134H();
        ArrayList<C0335h> arrayList = this.f1053va;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0335h hVar = (C0335h) this.f1053va.get(i);
                if (hVar instanceof C0349t) {
                    ((C0349t) hVar).mo1208K();
                }
            }
        }
    }

    /* renamed from: L */
    public void mo1258L() {
        this.f1053va.clear();
    }

    /* renamed from: a */
    public void mo1146a(C0351c cVar) {
        super.mo1146a(cVar);
        int size = this.f1053va.size();
        for (int i = 0; i < size; i++) {
            ((C0335h) this.f1053va.get(i)).mo1146a(cVar);
        }
    }

    /* renamed from: b */
    public void mo1259b(C0335h hVar) {
        this.f1053va.add(hVar);
        if (hVar.mo1182k() != null) {
            ((C0349t) hVar.mo1182k()).mo1260c(hVar);
        }
        hVar.mo1144a((C0335h) this);
    }

    /* renamed from: c */
    public void mo1260c(C0335h hVar) {
        this.f1053va.remove(hVar);
        hVar.mo1144a((C0335h) null);
    }

    /* renamed from: b */
    public void mo1154b(int i, int i2) {
        super.mo1154b(i, i2);
        int size = this.f1053va.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0335h) this.f1053va.get(i3)).mo1154b(mo1190o(), mo1192p());
        }
    }
}
