package android.support.design.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0416e;
import android.support.p044v4.view.C0697y;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Map;
import p000a.p005b.p008c.C0020a;
import p000a.p005b.p008c.p009a.C0028h;
import p000a.p005b.p008c.p009a.C0030j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g */
    private Map<View, Integer> f1281g;

    public FabTransformationSheetBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0381a mo1432a(Context context, boolean z) {
        int i;
        if (z) {
            i = C0020a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C0020a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C0381a aVar = new C0381a();
        aVar.f1277a = C0028h.m42a(context, i);
        aVar.f1278b = new C0030j(17, 0.0f, 0.0f);
        return aVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1428a(View view, View view2, boolean z, boolean z2) {
        m1444a(view2, z);
        return super.mo1428a(view, view2, z, z2);
    }

    /* renamed from: a */
    private void m1444a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f1281g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof C0416e) && (((C0416e) childAt.getLayoutParams()).mo1683d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f1281g;
                        if (map != null && map.containsKey(childAt)) {
                            C0697y.m2985d(childAt, ((Integer) this.f1281g.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.f1281g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0697y.m2985d(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f1281g = null;
            }
        }
    }
}
