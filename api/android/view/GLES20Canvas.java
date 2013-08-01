package android.view;

// Droidsafe Imports
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.TemporaryBuffer;
import android.text.GraphicsOperations;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import droidsafe.annotations.DSC;
import droidsafe.annotations.DSGeneratedField;
import droidsafe.annotations.DSGenerator;
import droidsafe.annotations.DSModeled;
import droidsafe.helpers.DSUtils;

class GLES20Canvas extends HardwareCanvas {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "D57F412B2FBE34E5266AB85A3EC09555", hash_generated_field = "EB29C468CD6CC66BADB54A0F112750F9")

    private boolean mOpaque;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "D9CFA901A96C28EEA9DD412429CB9486", hash_generated_field = "29611ED2287CE69051FC2BCDB2E2FF9D")

    private int mRenderer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "2D0BC5276619D20C917420C774FF5089", hash_generated_field = "8A3D5C4CB4C335D9AECD1C2651D2AAAF")

    @SuppressWarnings({"unused", "FieldCanBeLocal"}) private CanvasFinalizer mFinalizer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "A3DB1626A190732E588FD0D14FC8FB31", hash_generated_field = "380984B6D3BA888BD05804A5D24041AE")

    private int mWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "483542B05A951AA16D89C7F809C20811", hash_generated_field = "9A13F430E09A05B31C551CE62B9A37C1")

    private int mHeight;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "A71103FAF0A55FA79982ACB43DFBC49A", hash_generated_field = "6791C5CD1248B8A3047AAAB23F781F88")

    private final float[] mPoint = new float[2];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "8AF780D9E9617941A63F16F3D6400B2F", hash_generated_field = "BB2122C190B62908BBEDD5B8E43D320D")

    private final float[] mLine = new float[4];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.087 -0400", hash_original_field = "A51A4E6456596E09991D8FF2155CE00E", hash_generated_field = "49E49C9D9740E032CABA98DD5151CA56")

    private final Rect mClipBounds = new Rect();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.088 -0400", hash_original_field = "C781ED17A87FBE09F8079C6EC63D1F26", hash_generated_field = "7E8B7E1A9144C0D301C8FE334261595B")

    private DrawFilter mFilter;
    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.088 -0400", hash_original_method = "E61B8AD2F95A2B414E32399D6E0EB15F", hash_generated_method = "2AFB8DAA72D20488621230DD00C5A8A5")
      GLES20Canvas(boolean translucent) {
        this(false, translucent);
        addTaint(translucent);
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.089 -0400", hash_original_method = "7F059AE8F3F932B35FF16ED888919AA8", hash_generated_method = "74FC0FA718B9D10E4233916A4857DF72")
      GLES20Canvas(int layer, boolean translucent) {
        mOpaque = !translucent;
        mRenderer = nCreateLayerRenderer(layer);
        setupFinalizer();
        // ---------- Original Method ----------
        //mOpaque = !translucent;
        //mRenderer = nCreateLayerRenderer(layer);
        //setupFinalizer();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.089 -0400", hash_original_method = "E76C4C3F056A713824BBE7237B891059", hash_generated_method = "71C01C0F92BAF29181A5B3B9E2729313")
    protected  GLES20Canvas(boolean record, boolean translucent) {
        addTaint(record);
        mOpaque = !translucent;
        if(record)        
        {
            mRenderer = nCreateDisplayListRenderer();
        } //End block
        else
        {
            mRenderer = nCreateRenderer();
        } //End block
        setupFinalizer();
        // ---------- Original Method ----------
        //mOpaque = !translucent;
        //if (record) {
            //mRenderer = nCreateDisplayListRenderer();
        //} else {
            //mRenderer = nCreateRenderer();
        //}
        //setupFinalizer();
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nIsAvailable() {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
    @DSModeled(DSC.SAFE)
    static boolean isAvailable() {
        return sIsAvailable;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.090 -0400", hash_original_method = "C5F1546049F1B2879B50EF00176E7660", hash_generated_method = "ADEDB69734FF0455E767D4C03943CC39")
    private void setupFinalizer() {
        if(mRenderer == 0)        
        {
            IllegalStateException varC4B7F850A06E1E30E038C65FAC0396C6_2047901553 = new IllegalStateException("Could not create GLES20Canvas renderer");
            varC4B7F850A06E1E30E038C65FAC0396C6_2047901553.addTaint(taint);
            throw varC4B7F850A06E1E30E038C65FAC0396C6_2047901553;
        } //End block
        else
        {
            mFinalizer = new CanvasFinalizer(mRenderer);
        } //End block
        // ---------- Original Method ----------
        //if (mRenderer == 0) {
            //throw new IllegalStateException("Could not create GLES20Canvas renderer");
        //} else {
            //mFinalizer = new CanvasFinalizer(mRenderer);
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.091 -0400", hash_original_method = "DC942AC5C00E84A83A7A0337B1608CAB", hash_generated_method = "E424FF35B49ED518F1C9932756CF66A2")
    protected void resetDisplayListRenderer() {
        nResetDisplayListRenderer(mRenderer);
        // ---------- Original Method ----------
        //nResetDisplayListRenderer(mRenderer);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nCreateRenderer() {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    private static int nCreateLayerRenderer(int layer) {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    private static int nCreateDisplayListRenderer() {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    private static void nResetDisplayListRenderer(int renderer) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDestroyRenderer(int renderer) {
    }

    
    @DSModeled(DSC.SAFE)
    static int nCreateTextureLayer(boolean opaque, int[] layerInfo) {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    static int nCreateLayer(int width, int height, boolean isOpaque, int[] layerInfo) {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    static void nResizeLayer(int layerId, int width, int height, int[] layerInfo) {
    }

    
    @DSModeled(DSC.SAFE)
    static void nUpdateTextureLayer(int layerId, int width, int height, boolean opaque,
            SurfaceTexture surface) {
    }

    
    @DSModeled(DSC.SAFE)
    static void nSetTextureLayerTransform(int layerId, int matrix) {
    }

    
    @DSModeled(DSC.SAFE)
    static void nDestroyLayer(int layerId) {
    }

    
    @DSModeled(DSC.SAFE)
    static void nDestroyLayerDeferred(int layerId) {
    }

    
    @DSModeled(DSC.SAFE)
    static boolean nCopyLayer(int layerId, int bitmap) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.094 -0400", hash_original_method = "AB6C012A4EC234C0DA96929A7EE984CD", hash_generated_method = "269ED7110C1EE4D55F7662C4BBB50470")
    @Override
    public boolean isOpaque() {
        boolean varD57F412B2FBE34E5266AB85A3EC09555_950651362 = (mOpaque);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1141093914 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1141093914;
        // ---------- Original Method ----------
        //return mOpaque;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.094 -0400", hash_original_method = "AA9BA105372BFC95AFBABED408315F5C", hash_generated_method = "9C81E6D11C1E9C342AC66265239CB917")
    @Override
    public int getWidth() {
        int varA3DB1626A190732E588FD0D14FC8FB31_768214487 = (mWidth);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1372342627 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1372342627;
        // ---------- Original Method ----------
        //return mWidth;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.094 -0400", hash_original_method = "0304EDCF78FF45B68A7EB91BFEAAA2CD", hash_generated_method = "FB19029FDFB8843B55126C1F21D12D96")
    @Override
    public int getHeight() {
        int var483542B05A951AA16D89C7F809C20811_1683277198 = (mHeight);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1190540776 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1190540776;
        // ---------- Original Method ----------
        //return mHeight;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.095 -0400", hash_original_method = "10F69D1300E55A44C724BA9496871588", hash_generated_method = "87493A9A80663D778A96F88C22DE69F2")
    @Override
    public int getMaximumBitmapWidth() {
        int varF7C147EB016379DF55ED470E94ECF0DE_1489832132 = (nGetMaximumTextureWidth());
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1713382819 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1713382819;
        // ---------- Original Method ----------
        //return nGetMaximumTextureWidth();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.095 -0400", hash_original_method = "A5ADDC40BA4D92830B9288340B890F82", hash_generated_method = "E8288156A4A4674E8BFED168C4BFE53F")
    @Override
    public int getMaximumBitmapHeight() {
        int varCC613ED1478CA0A4367B4D62BAD817EF_1211091284 = (nGetMaximumTextureHeight());
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1767054604 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1767054604;
        // ---------- Original Method ----------
        //return nGetMaximumTextureHeight();
    }

    
    @DSModeled(DSC.SAFE)
    private static int nGetMaximumTextureWidth() {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    private static int nGetMaximumTextureHeight() {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.096 -0400", hash_original_method = "3FE83BE893B91EF457CAAB97151B4DC3", hash_generated_method = "CC3C39D0D5C07B70A32E1D6BF9872BD0")
    @Override
    public void setViewport(int width, int height) {
        mWidth = width;
        mHeight = height;
        nSetViewport(mRenderer, width, height);
        // ---------- Original Method ----------
        //mWidth = width;
        //mHeight = height;
        //nSetViewport(mRenderer, width, height);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nSetViewport(int renderer, int width, int height) {
    }

    
    @DSModeled(DSC.SAFE)
    public static boolean preserveBackBuffer() {
        return nPreserveBackBuffer();
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nPreserveBackBuffer() {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
    @DSModeled(DSC.SAFE)
    public static boolean isBackBufferPreserved() {
        return nIsBackBufferPreserved();
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nIsBackBufferPreserved() {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
    @DSModeled(DSC.SAFE)
    public static void disableVsync() {
        nDisableVsync();
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDisableVsync() {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.097 -0400", hash_original_method = "9B095EEB0FC45774066EB055E8D05D05", hash_generated_method = "100AB8E0C00A37D158A2FA76AB777030")
    @Override
     void onPreDraw(Rect dirty) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(dirty.getTaint());
        if(dirty != null)        
        {
            nPrepareDirty(mRenderer, dirty.left, dirty.top, dirty.right, dirty.bottom, mOpaque);
        } //End block
        else
        {
            nPrepare(mRenderer, mOpaque);
        } //End block
        // ---------- Original Method ----------
        //if (dirty != null) {
            //nPrepareDirty(mRenderer, dirty.left, dirty.top, dirty.right, dirty.bottom, mOpaque);
        //} else {
            //nPrepare(mRenderer, mOpaque);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    private static void nPrepare(int renderer, boolean opaque) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nPrepareDirty(int renderer, int left, int top, int right, int bottom,
            boolean opaque) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.097 -0400", hash_original_method = "7365F42EBD4B3D862109C8AFB45818F1", hash_generated_method = "D28DBD24898E379BFD423F6D4D12570A")
    @Override
     void onPostDraw() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        nFinish(mRenderer);
        // ---------- Original Method ----------
        //nFinish(mRenderer);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nFinish(int renderer) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.097 -0400", hash_original_method = "D585DC5373E63EDA28C11B713D8E1A5B", hash_generated_method = "67DE3CB02B37AB2F5A766B3E223F7896")
    @Override
    public boolean callDrawGLFunction(int drawGLFunction) {
        addTaint(drawGLFunction);
        boolean var8BFFDBEAFF2EFDF3164312F2AB2AA207_579356418 = (nCallDrawGLFunction(mRenderer, drawGLFunction));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_478104184 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_478104184;
        // ---------- Original Method ----------
        //return nCallDrawGLFunction(mRenderer, drawGLFunction);
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nCallDrawGLFunction(int renderer, int drawGLFunction) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
    @DSModeled(DSC.SAFE)
    public static void flushCaches(int level) {
        nFlushCaches(level);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nFlushCaches(int level) {
    }

    
    @DSModeled(DSC.SAFE)
    public static void terminateCaches() {
        nTerminateCaches();
    }

    
    @DSModeled(DSC.SAFE)
    private static void nTerminateCaches() {
    }

    
    @DSModeled(DSC.SAFE)
    public static void initCaches() {
        nInitCaches();
    }

    
    @DSModeled(DSC.SAFE)
    private static void nInitCaches() {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.097 -0400", hash_original_method = "B6A785707CFBE1E38AD4FE8A1D6625FF", hash_generated_method = "3CC76673BD4F23C0581307DFA4E2E2A3")
     int getDisplayList(int displayList) {
        addTaint(displayList);
        int varB0723F104765C12084C8EBEB7B27433A_908157326 = (nGetDisplayList(mRenderer, displayList));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_915487807 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_915487807;
        // ---------- Original Method ----------
        //return nGetDisplayList(mRenderer, displayList);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nGetDisplayList(int renderer, int displayList) {
        return DSUtils.UNKNOWN_INT;
    }

    
    @DSModeled(DSC.SAFE)
    static void destroyDisplayList(int displayList) {
        nDestroyDisplayList(displayList);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDestroyDisplayList(int displayList) {
    }

    
    @DSModeled(DSC.SAFE)
    static int getDisplayListSize(int displayList) {
        return nGetDisplayListSize(displayList);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nGetDisplayListSize(int displayList) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.098 -0400", hash_original_method = "444FDEED71E94CFCE2A65CC1E400505B", hash_generated_method = "976806108518C2937D63127ABDA1EE66")
    @Override
    public boolean drawDisplayList(DisplayList displayList, int width, int height, Rect dirty) {
        addTaint(dirty.getTaint());
        addTaint(height);
        addTaint(width);
        addTaint(displayList.getTaint());
        boolean var0F7B0A94047C775A9CCA1688036BC62B_1775094019 = (nDrawDisplayList(mRenderer,
                ((GLES20DisplayList) displayList).getNativeDisplayList(), width, height, dirty));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_487564464 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_487564464;
        // ---------- Original Method ----------
        //return nDrawDisplayList(mRenderer,
                //((GLES20DisplayList) displayList).getNativeDisplayList(), width, height, dirty);
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nDrawDisplayList(int renderer, int displayList,
            int width, int height, Rect dirty) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.098 -0400", hash_original_method = "5B863FAF56BDA796D9647970A297D545", hash_generated_method = "9C6B91518F1334CB3C0EE8419B7A8557")
    @Override
     void outputDisplayList(DisplayList displayList) {
        addTaint(displayList.getTaint());
        nOutputDisplayList(mRenderer, ((GLES20DisplayList) displayList).getNativeDisplayList());
        // ---------- Original Method ----------
        //nOutputDisplayList(mRenderer, ((GLES20DisplayList) displayList).getNativeDisplayList());
    }

    
    @DSModeled(DSC.SAFE)
    private static void nOutputDisplayList(int renderer, int displayList) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.098 -0400", hash_original_method = "34690C8D247D9A973C4DB94AE9D7C53D", hash_generated_method = "997C1B2E0341F9D6C632E364FEF49B4A")
     void drawHardwareLayer(HardwareLayer layer, float x, float y, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(y);
        addTaint(x);
        addTaint(layer.getTaint());
        final GLES20Layer glLayer = (GLES20Layer) layer;
        int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        nDrawLayer(mRenderer, glLayer.getLayer(), x, y, nativePaint);
        if(modifier != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifier);
        // ---------- Original Method ----------
        //final GLES20Layer glLayer = (GLES20Layer) layer;
        //int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //nDrawLayer(mRenderer, glLayer.getLayer(), x, y, nativePaint);
        //if (modifier != MODIFIER_NONE) nResetModifiers(mRenderer, modifier);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawLayer(int renderer, int layer, float x, float y, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.098 -0400", hash_original_method = "2CAEF0DDE58BE10FAAA9AA0E667CCD64", hash_generated_method = "BA861453510B5BC8D04AD58E7A1553A0")
     void interrupt() {
        nInterrupt(mRenderer);
        // ---------- Original Method ----------
        //nInterrupt(mRenderer);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.098 -0400", hash_original_method = "C365B4BBFEB4F0EDD5006A765220696B", hash_generated_method = "1C80A41B36E63E43CCFBDD0716C47088")
     void resume() {
        nResume(mRenderer);
        // ---------- Original Method ----------
        //nResume(mRenderer);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nInterrupt(int renderer) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nResume(int renderer) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.099 -0400", hash_original_method = "CD9590925AA701F1E39AE88CF6AE97E7", hash_generated_method = "873CDCCA7B59E49891AA664595CD6BFC")
    @Override
    public boolean clipPath(Path path) {
        addTaint(path.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_1317343318 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_1317343318.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_1317343318;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.099 -0400", hash_original_method = "A0322959331EF06FDECE706338820D13", hash_generated_method = "3A440F07ACECE22AFA935F605E11CE09")
    @Override
    public boolean clipPath(Path path, Region.Op op) {
        addTaint(op.getTaint());
        addTaint(path.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_2123594236 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_2123594236.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_2123594236;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.099 -0400", hash_original_method = "3AC948804DA1E718A76D8B221FEACE24", hash_generated_method = "9DED3282209E6A13CFC4E9DF707DC77B")
    @Override
    public boolean clipRect(float left, float top, float right, float bottom) {
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        boolean var89B23FF280FFA824B378FE20F78CB7A5_1588024511 = (nClipRect(mRenderer, left, top, right, bottom, Region.Op.INTERSECT.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_883531288 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_883531288;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, left, top, right, bottom, Region.Op.INTERSECT.nativeInt);
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nClipRect(int renderer, float left, float top,
            float right, float bottom, int op) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "CF0F08AE677C71FBDBDD5FF973518EEC", hash_generated_method = "BB5963FF5C870664768CF21097EF2832")
    @Override
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) {
        addTaint(op.getTaint());
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        boolean varE92DCB0A2C1A37C14D92C05CF2FCC325_458975546 = (nClipRect(mRenderer, left, top, right, bottom, op.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1222405396 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1222405396;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, left, top, right, bottom, op.nativeInt);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "3911A8B4E2CBFCB889327A4F77A9CAF7", hash_generated_method = "28960AD2445D5FF0A341844D4490FAE0")
    @Override
    public boolean clipRect(int left, int top, int right, int bottom) {
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        boolean var89B23FF280FFA824B378FE20F78CB7A5_1180171575 = (nClipRect(mRenderer, left, top, right, bottom, Region.Op.INTERSECT.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_937164517 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_937164517;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, left, top, right, bottom, Region.Op.INTERSECT.nativeInt);
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nClipRect(int renderer, int left, int top, int right, int bottom,
            int op) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "C5507A7F3855C8C6C63565CD78400CEB", hash_generated_method = "6DD3E9DB4B61FA7520EF180D9FAAE0D8")
    @Override
    public boolean clipRect(Rect rect) {
        addTaint(rect.getTaint());
        boolean var9E9D54F02CB180C00C7EDBC15A4FA604_1721081782 = (nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom,
                Region.Op.INTERSECT.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_146954334 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_146954334;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom,
                //Region.Op.INTERSECT.nativeInt);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "CE1C58CF7145731A4EAE6ABB1C090975", hash_generated_method = "B220FE415565BA95CDBB1580411B45FE")
    @Override
    public boolean clipRect(Rect rect, Region.Op op) {
        addTaint(op.getTaint());
        addTaint(rect.getTaint());
        boolean var883EAF71FB92F9F1F1A2153E07A28588_1508266414 = (nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom, op.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_848619383 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_848619383;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom, op.nativeInt);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "82CE8198F83847EB9950BBA97A14CB45", hash_generated_method = "D1DD086E047148B7BA887B44B9BBBE02")
    @Override
    public boolean clipRect(RectF rect) {
        addTaint(rect.getTaint());
        boolean var9E9D54F02CB180C00C7EDBC15A4FA604_1387821462 = (nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom,
                Region.Op.INTERSECT.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2103851901 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2103851901;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom,
                //Region.Op.INTERSECT.nativeInt);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "84F2B877854C623DFB4ED57554605946", hash_generated_method = "DC387DE3B7E0C49E8F9FFE5BED8B4EA8")
    @Override
    public boolean clipRect(RectF rect, Region.Op op) {
        addTaint(op.getTaint());
        addTaint(rect.getTaint());
        boolean var883EAF71FB92F9F1F1A2153E07A28588_753881755 = (nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom, op.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_154327634 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_154327634;
        // ---------- Original Method ----------
        //return nClipRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom, op.nativeInt);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "668D615301DC55EDCE9C8FA044FF5F71", hash_generated_method = "EB3B1F0247A83A8563F6BCFBF83F8FA4")
    @Override
    public boolean clipRegion(Region region) {
        addTaint(region.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_252908501 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_252908501.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_252908501;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.100 -0400", hash_original_method = "9554359F0ECC8D3364C9D02F1B6C0A6E", hash_generated_method = "089F9899CE87A15284B7BCABD04B3684")
    @Override
    public boolean clipRegion(Region region, Region.Op op) {
        addTaint(op.getTaint());
        addTaint(region.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_951700716 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_951700716.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_951700716;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "5A157FCBBF6BAEFB3D0D6DDEEF98EB76", hash_generated_method = "FB486489F71189233148C8313A7FFB8B")
    @Override
    public boolean getClipBounds(Rect bounds) {
        addTaint(bounds.getTaint());
        boolean var39DFF8903C8DDE2FAE867DBC4A09CEF7_78593265 = (nGetClipBounds(mRenderer, bounds));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1175373763 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1175373763;
        // ---------- Original Method ----------
        //return nGetClipBounds(mRenderer, bounds);
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nGetClipBounds(int renderer, Rect bounds) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "0662E9735A64886F23067D669F3F560C", hash_generated_method = "52A4102B3D39FB23A32AF6794C4A750B")
    @Override
    public boolean quickReject(float left, float top, float right, float bottom, EdgeType type) {
        addTaint(type.getTaint());
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        boolean varD2C36748788BD5AD12C5DEAB4866E474_2085540168 = (nQuickReject(mRenderer, left, top, right, bottom, type.nativeInt));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1256105455 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1256105455;
        // ---------- Original Method ----------
        //return nQuickReject(mRenderer, left, top, right, bottom, type.nativeInt);
    }

    
    @DSModeled(DSC.SAFE)
    private static boolean nQuickReject(int renderer, float left, float top,
            float right, float bottom, int edge) {
        return DSUtils.UNKNOWN_BOOLEAN;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "866F13730ACFD67020DA883631339738", hash_generated_method = "CB4088688416A3A958C253E55CDC50B9")
    @Override
    public boolean quickReject(Path path, EdgeType type) {
        addTaint(type.getTaint());
        addTaint(path.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_1653755501 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_1653755501.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_1653755501;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "0E7313D794F0C2C284156675C98816BB", hash_generated_method = "EF40759E834F49CA7D674AC47105E720")
    @Override
    public boolean quickReject(RectF rect, EdgeType type) {
        addTaint(type.getTaint());
        addTaint(rect.getTaint());
        boolean varBEEBA0E86EA880C0912462C1F2B0EDE7_2116299005 = (quickReject(rect.left, rect.top, rect.right, rect.bottom, type));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1057564271 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1057564271;
        // ---------- Original Method ----------
        //return quickReject(rect.left, rect.top, rect.right, rect.bottom, type);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "D702D49D0CBA8DAFFC483E145A7D155B", hash_generated_method = "9F1C4B541DA6BCF82C75E3E3336AD9EB")
    @Override
    public void translate(float dx, float dy) {
        addTaint(dy);
        addTaint(dx);
        if(dx != 0.0f || dy != 0.0f)        
        nTranslate(mRenderer, dx, dy);
        // ---------- Original Method ----------
        //if (dx != 0.0f || dy != 0.0f) nTranslate(mRenderer, dx, dy);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nTranslate(int renderer, float dx, float dy) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "B4BEAF66CD344F6FBAA1A7BCA9EAC51C", hash_generated_method = "0212FAEA49320B139B41D8B1A3049035")
    @Override
    public void skew(float sx, float sy) {
        addTaint(sy);
        addTaint(sx);
        nSkew(mRenderer, sx, sy);
        // ---------- Original Method ----------
        //nSkew(mRenderer, sx, sy);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nSkew(int renderer, float sx, float sy) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.101 -0400", hash_original_method = "088A2140F7946F7E1F87C60185C75E3A", hash_generated_method = "06F47DA2C4BC0BFD54CD0F55B50E8AA7")
    @Override
    public void rotate(float degrees) {
        addTaint(degrees);
        nRotate(mRenderer, degrees);
        // ---------- Original Method ----------
        //nRotate(mRenderer, degrees);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nRotate(int renderer, float degrees) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "407ACB57F0B4398889DAE0D23801B26B", hash_generated_method = "9C32413688507E5B3B4B5C43AA370798")
    @Override
    public void scale(float sx, float sy) {
        addTaint(sy);
        addTaint(sx);
        nScale(mRenderer, sx, sy);
        // ---------- Original Method ----------
        //nScale(mRenderer, sx, sy);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nScale(int renderer, float sx, float sy) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "F6D59AD1FAE97EC22EF86A1DF6443B3F", hash_generated_method = "D26407292801951992231AE3DB5D5B76")
    @Override
    public void setMatrix(Matrix matrix) {
        addTaint(matrix.getTaint());
        nSetMatrix(mRenderer, matrix.native_instance);
        // ---------- Original Method ----------
        //nSetMatrix(mRenderer, matrix.native_instance);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nSetMatrix(int renderer, int matrix) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "5C2AB9AC8E62FE145634A1140AF6AF7A", hash_generated_method = "39F006588A5C3BDA9624B952E563867A")
    @Override
    public void getMatrix(Matrix matrix) {
        addTaint(matrix.getTaint());
        nGetMatrix(mRenderer, matrix.native_instance);
        // ---------- Original Method ----------
        //nGetMatrix(mRenderer, matrix.native_instance);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nGetMatrix(int renderer, int matrix) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "D981C9A8CE9E8AB948A57E105C909748", hash_generated_method = "DD56A9DE49EC546344D9FB1A6FA7C388")
    @Override
    public void concat(Matrix matrix) {
        addTaint(matrix.getTaint());
        nConcatMatrix(mRenderer, matrix.native_instance);
        // ---------- Original Method ----------
        //nConcatMatrix(mRenderer, matrix.native_instance);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nConcatMatrix(int renderer, int matrix) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "7EFF2592C3C6BD5E4F13755A0D5399A0", hash_generated_method = "AB55A62B6B649F64249CCEE1D304ACD4")
    @Override
    public int save() {
        int varBB74372FF18FEE33CB51B124B07FCD59_1541810513 = (nSave(mRenderer, Canvas.CLIP_SAVE_FLAG | Canvas.MATRIX_SAVE_FLAG));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_215389871 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_215389871;
        // ---------- Original Method ----------
        //return nSave(mRenderer, Canvas.CLIP_SAVE_FLAG | Canvas.MATRIX_SAVE_FLAG);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "F50C3BBFE7BD2C9D29BCAB4C8FE567F6", hash_generated_method = "06E88E46B57D69A059246E1DB3B8AF53")
    @Override
    public int save(int saveFlags) {
        addTaint(saveFlags);
        int var83B098C10803F9C5FC6B081963F88E64_216321740 = (nSave(mRenderer, saveFlags));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_874541117 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_874541117;
        // ---------- Original Method ----------
        //return nSave(mRenderer, saveFlags);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nSave(int renderer, int flags) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.102 -0400", hash_original_method = "9DF5A937336C76576E5F634C144FC48D", hash_generated_method = "D068C94C8B5494A8C38F1CD54660D4B7")
    @Override
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        addTaint(saveFlags);
        addTaint(paint.getTaint());
        addTaint(bounds.getTaint());
        if(bounds != null)        
        {
            int var6C14327D501CB2DF47256E66D8117CF0_1023443284 = (saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, paint, saveFlags));
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_885042281 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_885042281;
        } //End block
        int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        int count = nSaveLayer(mRenderer, nativePaint, saveFlags);
        if(modifier != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifier);
        int varE2942A04780E223B215EB8B663CF5353_1987129201 = (count);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_915649407 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_915649407;
        // ---------- Original Method ----------
        //if (bounds != null) {
            //return saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, paint, saveFlags);
        //}
        //int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //int count = nSaveLayer(mRenderer, nativePaint, saveFlags);
        //if (modifier != MODIFIER_NONE) nResetModifiers(mRenderer, modifier);
        //return count;
    }

    
    @DSModeled(DSC.SAFE)
    private static int nSaveLayer(int renderer, int paint, int saveFlags) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.103 -0400", hash_original_method = "E794596E5060868E9256D6234D184C09", hash_generated_method = "5F9C3379AB4BB80E20EDB29997C17955")
    @Override
    public int saveLayer(float left, float top, float right, float bottom, Paint paint,
            int saveFlags) {
        addTaint(saveFlags);
        addTaint(paint.getTaint());
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        if(left < right && top < bottom)        
        {
            int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
            final int nativePaint = paint == null ? 0 : paint.mNativePaint;
            int count = nSaveLayer(mRenderer, left, top, right, bottom, nativePaint, saveFlags);
            if(modifier != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifier);
            int varE2942A04780E223B215EB8B663CF5353_1505562289 = (count);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1184640961 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1184640961;
        } //End block
        int var93E11C19FAFCCBCB4B81A37D476FB864_121035231 = (save(saveFlags));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1390285087 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1390285087;
        // ---------- Original Method ----------
        //if (left < right && top < bottom) {
            //int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
            //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
            //int count = nSaveLayer(mRenderer, left, top, right, bottom, nativePaint, saveFlags);
            //if (modifier != MODIFIER_NONE) nResetModifiers(mRenderer, modifier);
            //return count;
        //}
        //return save(saveFlags);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nSaveLayer(int renderer, float left, float top,
            float right, float bottom, int paint, int saveFlags) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.103 -0400", hash_original_method = "E4AB6B80C5EF0D5B797D753415FED0BE", hash_generated_method = "F0034CB13E5D90BD5657E5959427B098")
    @Override
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        addTaint(saveFlags);
        addTaint(alpha);
        addTaint(bounds.getTaint());
        if(bounds != null)        
        {
            int var680C56DCD82C6DE036ED8C78E543A1E1_1817812686 = (saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom,
                    alpha, saveFlags));
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_30063698 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_30063698;
        } //End block
        int var5CA833EA5C757196FCF1809B451D6ED4_1945969163 = (nSaveLayerAlpha(mRenderer, alpha, saveFlags));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_719991797 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_719991797;
        // ---------- Original Method ----------
        //if (bounds != null) {
            //return saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom,
                    //alpha, saveFlags);
        //}
        //return nSaveLayerAlpha(mRenderer, alpha, saveFlags);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nSaveLayerAlpha(int renderer, int alpha, int saveFlags) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.104 -0400", hash_original_method = "B4AB4565F10B041D742F1796C47ECB95", hash_generated_method = "E15436CFDECE94EC35271A1B120D06AD")
    @Override
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha,
            int saveFlags) {
        addTaint(saveFlags);
        addTaint(alpha);
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        if(left < right && top < bottom)        
        {
            int var86A0D67CF338C0CF143EF13E4B3BEE1C_758382925 = (nSaveLayerAlpha(mRenderer, left, top, right, bottom, alpha, saveFlags));
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_230347696 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_230347696;
        } //End block
        int var93E11C19FAFCCBCB4B81A37D476FB864_80226393 = (save(saveFlags));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1678529130 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1678529130;
        // ---------- Original Method ----------
        //if (left < right && top < bottom) {
            //return nSaveLayerAlpha(mRenderer, left, top, right, bottom, alpha, saveFlags);
        //}
        //return save(saveFlags);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nSaveLayerAlpha(int renderer, float left, float top, float right,
            float bottom, int alpha, int saveFlags) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.104 -0400", hash_original_method = "C18753FB8460844761E485A3B07AB085", hash_generated_method = "70D1825D14CEDE923274F8D7C79BA367")
    @Override
    public void restore() {
        nRestore(mRenderer);
        // ---------- Original Method ----------
        //nRestore(mRenderer);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nRestore(int renderer) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.105 -0400", hash_original_method = "03029795119CF4F7F4374FF9CDD913F1", hash_generated_method = "9866F503B48E3048E862E853D8DE1004")
    @Override
    public void restoreToCount(int saveCount) {
        addTaint(saveCount);
        nRestoreToCount(mRenderer, saveCount);
        // ---------- Original Method ----------
        //nRestoreToCount(mRenderer, saveCount);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nRestoreToCount(int renderer, int saveCount) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.105 -0400", hash_original_method = "5171A9EFFCF2464453072A29F0BC817F", hash_generated_method = "F66C58BB23E9C3AF41A87C1495013898")
    @Override
    public int getSaveCount() {
        int var07BC16A087EC2F97F6B7AAC46DF1D0FB_1470650181 = (nGetSaveCount(mRenderer));
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2130724737 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2130724737;
        // ---------- Original Method ----------
        //return nGetSaveCount(mRenderer);
    }

    
    @DSModeled(DSC.SAFE)
    private static int nGetSaveCount(int renderer) {
        return DSUtils.UNKNOWN_INT;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.106 -0400", hash_original_method = "846B7706B193B695840103C92096214E", hash_generated_method = "2A2151BC53135B33E05ECD91C4DDE028")
    @Override
    public void setDrawFilter(DrawFilter filter) {
        mFilter = filter;
        // ---------- Original Method ----------
        //mFilter = filter;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.106 -0400", hash_original_method = "00C808EC6F25CC6E1FA57C10F69CA13D", hash_generated_method = "3A6A81FB777F85B5C877EE4EDF284B5B")
    @Override
    public DrawFilter getDrawFilter() {
DrawFilter var6104E4BD549FCD2640641D136DD683A6_1497114952 =         mFilter;
        var6104E4BD549FCD2640641D136DD683A6_1497114952.addTaint(taint);
        return var6104E4BD549FCD2640641D136DD683A6_1497114952;
        // ---------- Original Method ----------
        //return mFilter;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.106 -0400", hash_original_method = "1B5F3778D027ED2D7C875DF279109721", hash_generated_method = "32F41CE9D8CF07BE82A7027D5C730880")
    @Override
    public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter,
            Paint paint) {
        addTaint(paint.getTaint());
        addTaint(useCenter);
        addTaint(sweepAngle);
        addTaint(startAngle);
        addTaint(oval.getTaint());
        int modifiers = setupModifiers(paint);
        nDrawArc(mRenderer, oval.left, oval.top, oval.right, oval.bottom, startAngle, sweepAngle,
                useCenter, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //nDrawArc(mRenderer, oval.left, oval.top, oval.right, oval.bottom, startAngle, sweepAngle,
                //useCenter, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawArc(int renderer, float left, float top,
            float right, float bottom, float startAngle, float sweepAngle,
            boolean useCenter, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.111 -0400", hash_original_method = "AAC237D01F9254CC358C9D52B0A20AD9", hash_generated_method = "056F36CA49CC96D882A23D6253B9EA23")
    @Override
    public void drawARGB(int a, int r, int g, int b) {
        addTaint(b);
        addTaint(g);
        addTaint(r);
        addTaint(a);
        drawColor((a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF));
        // ---------- Original Method ----------
        //drawColor((a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF));
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.111 -0400", hash_original_method = "3E288E14B7CE68A819334B0A90162954", hash_generated_method = "7AC6D5A04025FF0F15BCC4B7A9825784")
    @Override
    public void drawPatch(Bitmap bitmap, byte[] chunks, RectF dst, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(dst.getTaint());
        addTaint(chunks[0]);
        addTaint(bitmap.getTaint());
        int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        nDrawPatch(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, chunks,
                dst.left, dst.top, dst.right, dst.bottom, nativePaint);
        if(modifier != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifier);
        // ---------- Original Method ----------
        //int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //nDrawPatch(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, chunks,
                //dst.left, dst.top, dst.right, dst.bottom, nativePaint);
        //if (modifier != MODIFIER_NONE) nResetModifiers(mRenderer, modifier);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawPatch(int renderer, int bitmap, byte[] buffer, byte[] chunks,
            float left, float top, float right, float bottom, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.111 -0400", hash_original_method = "BF78CEE5A5D5A0B7000D42B8D7CD12A6", hash_generated_method = "63652DBC220F442FA35F1DF187A840BA")
    @Override
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(top);
        addTaint(left);
        addTaint(bitmap.getTaint());
        int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, left, top, nativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, left, top, nativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawBitmap(
            int renderer, int bitmap, byte[] buffer, float left, float top, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.111 -0400", hash_original_method = "7A23E114FF3FC414FFADAB9162210E17", hash_generated_method = "77800C56F7A3BF21B32AC59C4E20982A")
    @Override
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(matrix.getTaint());
        addTaint(bitmap.getTaint());
        int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer,
                matrix.native_instance, nativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer,
                //matrix.native_instance, nativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawBitmap(int renderer, int bitmap, byte[] buff,
            int matrix, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.112 -0400", hash_original_method = "025B89D3F15CD9670FC3D74B91AB5D58", hash_generated_method = "5EF40C1FA30701B82DDAC90FA0F06068")
    @Override
    public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(dst.getTaint());
        addTaint(src.getTaint());
        addTaint(bitmap.getTaint());
        int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        int left;
        int top;
        int right;
        int bottom;
        if(src == null)        
        {
            left = top = 0;
            right = bitmap.getWidth();
            bottom = bitmap.getHeight();
        } //End block
        else
        {
            left = src.left;
            right = src.right;
            top = src.top;
            bottom = src.bottom;
        } //End block
        nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, left, top, right, bottom,
                dst.left, dst.top, dst.right, dst.bottom, nativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //int left, top, right, bottom;
        //if (src == null) {
            //left = top = 0;
            //right = bitmap.getWidth();
            //bottom = bitmap.getHeight();
        //} else {
            //left = src.left;
            //right = src.right;
            //top = src.top;
            //bottom = src.bottom;
        //}
        //nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, left, top, right, bottom,
                //dst.left, dst.top, dst.right, dst.bottom, nativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.115 -0400", hash_original_method = "18A7A5D5D5C8B881DFD85E47F7DA3439", hash_generated_method = "DF85C1A6DC7E947ACE5692AB3884D7DD")
    @Override
    public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(dst.getTaint());
        addTaint(src.getTaint());
        addTaint(bitmap.getTaint());
        int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        float left;
        float top;
        float right;
        float bottom;
        if(src == null)        
        {
            left = top = 0;
            right = bitmap.getWidth();
            bottom = bitmap.getHeight();
        } //End block
        else
        {
            left = src.left;
            right = src.right;
            top = src.top;
            bottom = src.bottom;
        } //End block
        nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, left, top, right, bottom,
                dst.left, dst.top, dst.right, dst.bottom, nativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //float left, top, right, bottom;
        //if (src == null) {
            //left = top = 0;
            //right = bitmap.getWidth();
            //bottom = bitmap.getHeight();
        //} else {
            //left = src.left;
            //right = src.right;
            //top = src.top;
            //bottom = src.bottom;
        //}
        //nDrawBitmap(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, left, top, right, bottom,
                //dst.left, dst.top, dst.right, dst.bottom, nativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawBitmap(int renderer, int bitmap, byte[] buffer,
            float srcLeft, float srcTop, float srcRight, float srcBottom,
            float left, float top, float right, float bottom, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.115 -0400", hash_original_method = "9B6F84B3164E22399F0F518F30D6F56B", hash_generated_method = "5446C43054469AD262F4DED8FBBDF7E2")
    @Override
    public void drawBitmap(int[] colors, int offset, int stride, float x, float y,
            int width, int height, boolean hasAlpha, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(hasAlpha);
        addTaint(height);
        addTaint(width);
        addTaint(y);
        addTaint(x);
        addTaint(stride);
        addTaint(offset);
        addTaint(colors[0]);
        int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        final Bitmap.Config config = hasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        final Bitmap b = Bitmap.createBitmap(colors, offset, stride, width, height, config);
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        nDrawBitmap(mRenderer, b.mNativeBitmap, b.mBuffer, x, y, nativePaint);
        b.recycle();
        if(modifier != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifier);
        // ---------- Original Method ----------
        //int modifier = paint != null ? setupColorFilter(paint) : MODIFIER_NONE;
        //final Bitmap.Config config = hasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        //final Bitmap b = Bitmap.createBitmap(colors, offset, stride, width, height, config);
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //nDrawBitmap(mRenderer, b.mNativeBitmap, b.mBuffer, x, y, nativePaint);
        //b.recycle();
        //if (modifier != MODIFIER_NONE) nResetModifiers(mRenderer, modifier);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.117 -0400", hash_original_method = "1DECC82647C03783DFB70A54A4715DCA", hash_generated_method = "1B6822115F8797CEFF093DB7882E6C34")
    @Override
    public void drawBitmap(int[] colors, int offset, int stride, int x, int y,
            int width, int height, boolean hasAlpha, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(hasAlpha);
        addTaint(height);
        addTaint(width);
        addTaint(y);
        addTaint(x);
        addTaint(stride);
        addTaint(offset);
        addTaint(colors[0]);
        drawBitmap(colors, offset, stride, (float) x, (float) y, width, height, hasAlpha, paint);
        // ---------- Original Method ----------
        //drawBitmap(colors, offset, stride, (float) x, (float) y, width, height, hasAlpha, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.117 -0400", hash_original_method = "B49032D10E62987D37B2D43027E8B7B3", hash_generated_method = "5AAA07898287D2A9D9279441A8626754")
    @Override
    public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts,
            int vertOffset, int[] colors, int colorOffset, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(colorOffset);
        addTaint(colors[0]);
        addTaint(vertOffset);
        addTaint(verts[0]);
        addTaint(meshHeight);
        addTaint(meshWidth);
        addTaint(bitmap.getTaint());
        if(meshWidth < 0 || meshHeight < 0 || vertOffset < 0 || colorOffset < 0)        
        {
            ArrayIndexOutOfBoundsException var37DB57B1FEB1C9FBA644A093BFA8B678_1697162651 = new ArrayIndexOutOfBoundsException();
            var37DB57B1FEB1C9FBA644A093BFA8B678_1697162651.addTaint(taint);
            throw var37DB57B1FEB1C9FBA644A093BFA8B678_1697162651;
        } //End block
        if(meshWidth == 0 || meshHeight == 0)        
        {
            return;
        } //End block
        final int count = (meshWidth + 1) * (meshHeight + 1);
        checkRange(verts.length, vertOffset, count * 2);
        colors = null;
        colorOffset = 0;
        int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        nDrawBitmapMesh(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, meshWidth, meshHeight,
                verts, vertOffset, colors, colorOffset, nativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //if (meshWidth < 0 || meshHeight < 0 || vertOffset < 0 || colorOffset < 0) {
            //throw new ArrayIndexOutOfBoundsException();
        //}
        //if (meshWidth == 0 || meshHeight == 0) {
            //return;
        //}
        //final int count = (meshWidth + 1) * (meshHeight + 1);
        //checkRange(verts.length, vertOffset, count * 2);
        //colors = null;
        //colorOffset = 0;
        //int modifiers = paint != null ? setupModifiers(bitmap, paint) : MODIFIER_NONE;
        //final int nativePaint = paint == null ? 0 : paint.mNativePaint;
        //nDrawBitmapMesh(mRenderer, bitmap.mNativeBitmap, bitmap.mBuffer, meshWidth, meshHeight,
                //verts, vertOffset, colors, colorOffset, nativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawBitmapMesh(int renderer, int bitmap, byte[] buffer,
            int meshWidth, int meshHeight, float[] verts, int vertOffset,
            int[] colors, int colorOffset, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.118 -0400", hash_original_method = "3CC575BC6DB3F469750010B2B8CAC81C", hash_generated_method = "CFCE24718E3E7CF1D5E9A2A4D98BACB8")
    @Override
    public void drawCircle(float cx, float cy, float radius, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(radius);
        addTaint(cy);
        addTaint(cx);
        int modifiers = setupModifiers(paint);
        nDrawCircle(mRenderer, cx, cy, radius, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //nDrawCircle(mRenderer, cx, cy, radius, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawCircle(int renderer, float cx, float cy,
            float radius, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.122 -0400", hash_original_method = "4F7ABDA5E981B914379787693CC10165", hash_generated_method = "C3C2A08E4F406434E020AFF0EA8C3C4A")
    @Override
    public void drawColor(int color) {
        addTaint(color);
        drawColor(color, PorterDuff.Mode.SRC_OVER);
        // ---------- Original Method ----------
        //drawColor(color, PorterDuff.Mode.SRC_OVER);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.122 -0400", hash_original_method = "CF35C7302232BF0C4B60CFA92B96D407", hash_generated_method = "7AA2693CA714743AC774AEC1B0C16439")
    @Override
    public void drawColor(int color, PorterDuff.Mode mode) {
        addTaint(mode.getTaint());
        addTaint(color);
        nDrawColor(mRenderer, color, mode.nativeInt);
        // ---------- Original Method ----------
        //nDrawColor(mRenderer, color, mode.nativeInt);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawColor(int renderer, int color, int mode) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.123 -0400", hash_original_method = "5EABC5A9A71D080A656B11841F718311", hash_generated_method = "6330210DF13C15F2273C445DAFF62A14")
    @Override
    public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) {
        addTaint(paint.getTaint());
        mLine[0] = startX;
        mLine[1] = startY;
        mLine[2] = stopX;
        mLine[3] = stopY;
        drawLines(mLine, 0, 4, paint);
        // ---------- Original Method ----------
        //mLine[0] = startX;
        //mLine[1] = startY;
        //mLine[2] = stopX;
        //mLine[3] = stopY;
        //drawLines(mLine, 0, 4, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.125 -0400", hash_original_method = "CC8F0B4448632DE8A259253A60E2B3F7", hash_generated_method = "2711521CE4D5B970422CD000F1800AD9")
    @Override
    public void drawLines(float[] pts, int offset, int count, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(count);
        addTaint(offset);
        addTaint(pts[0]);
        if((offset | count) < 0 || offset + count > pts.length)        
        {
            IllegalArgumentException var549D16F3405BF0B3A7D18DF89C5725E5_81784641 = new IllegalArgumentException("The lines array must contain 4 elements per line.");
            var549D16F3405BF0B3A7D18DF89C5725E5_81784641.addTaint(taint);
            throw var549D16F3405BF0B3A7D18DF89C5725E5_81784641;
        } //End block
        int modifiers = setupModifiers(paint);
        nDrawLines(mRenderer, pts, offset, count, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //if ((offset | count) < 0 || offset + count > pts.length) {
            //throw new IllegalArgumentException("The lines array must contain 4 elements per line.");
        //}
        //int modifiers = setupModifiers(paint);
        //nDrawLines(mRenderer, pts, offset, count, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawLines(int renderer, float[] points,
            int offset, int count, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.125 -0400", hash_original_method = "C2DF9F5B70F03E16002905BD3365AB2E", hash_generated_method = "DD7D0820367BD7CCFC6E6C3BFF1DD24E")
    @Override
    public void drawLines(float[] pts, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(pts[0]);
        drawLines(pts, 0, pts.length, paint);
        // ---------- Original Method ----------
        //drawLines(pts, 0, pts.length, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.125 -0400", hash_original_method = "3C8333232F307DB00830ADFD9367082C", hash_generated_method = "BE7290F5D782DE45BBDFEB33AA60151D")
    @Override
    public void drawOval(RectF oval, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(oval.getTaint());
        int modifiers = setupModifiers(paint);
        nDrawOval(mRenderer, oval.left, oval.top, oval.right, oval.bottom, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //nDrawOval(mRenderer, oval.left, oval.top, oval.right, oval.bottom, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawOval(int renderer, float left, float top,
            float right, float bottom, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.125 -0400", hash_original_method = "F3CEC7F1ABD68352F2A5895BCD8335A7", hash_generated_method = "A57933C0DD66BB033573162B66104A07")
    @Override
    public void drawPaint(Paint paint) {
        addTaint(paint.getTaint());
        final Rect r = mClipBounds;
        nGetClipBounds(mRenderer, r);
        drawRect(r.left, r.top, r.right, r.bottom, paint);
        // ---------- Original Method ----------
        //final Rect r = mClipBounds;
        //nGetClipBounds(mRenderer, r);
        //drawRect(r.left, r.top, r.right, r.bottom, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.125 -0400", hash_original_method = "E734C6F1749AB430929BC8490D600517", hash_generated_method = "7FDA9F40B87F90E80BDF6F3BB434DEA4")
    @Override
    public void drawPath(Path path, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(path.getTaint());
        int modifiers = setupModifiers(paint);
        if(path.isSimplePath)        
        {
            if(path.rects != null)            
            {
                nDrawRects(mRenderer, path.rects.mNativeRegion, paint.mNativePaint);
            } //End block
        } //End block
        else
        {
            nDrawPath(mRenderer, path.mNativePath, paint.mNativePaint);
        } //End block
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //if (path.isSimplePath) {
            //if (path.rects != null) {
                //nDrawRects(mRenderer, path.rects.mNativeRegion, paint.mNativePaint);
            //}
        //} else {
            //nDrawPath(mRenderer, path.mNativePath, paint.mNativePaint);
        //}
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawPath(int renderer, int path, int paint) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawRects(int renderer, int region, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.127 -0400", hash_original_method = "2AA9BBA2F44244E312AB57A12DAF658B", hash_generated_method = "1491E439E88410428C7E53C97A463DC1")
    @Override
    public void drawPicture(Picture picture) {
        addTaint(picture.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_952698091 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_952698091.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_952698091;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.127 -0400", hash_original_method = "1202DF046E7699A744E442D410CE2128", hash_generated_method = "E89905EE63C98A1CC99B89C9F83B8B2D")
    @Override
    public void drawPicture(Picture picture, Rect dst) {
        addTaint(dst.getTaint());
        addTaint(picture.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_661744875 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_661744875.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_661744875;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.127 -0400", hash_original_method = "CE526B9F8925E416169A22B853086EA4", hash_generated_method = "52DE050D95A5E5D0DA07309737836577")
    @Override
    public void drawPicture(Picture picture, RectF dst) {
        addTaint(dst.getTaint());
        addTaint(picture.getTaint());
        UnsupportedOperationException var81FA7E299EEE7F062EBFBEEF08B0464D_1839923968 = new UnsupportedOperationException();
        var81FA7E299EEE7F062EBFBEEF08B0464D_1839923968.addTaint(taint);
        throw var81FA7E299EEE7F062EBFBEEF08B0464D_1839923968;
        // ---------- Original Method ----------
        //throw new UnsupportedOperationException();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.127 -0400", hash_original_method = "711B0E1C295D7644DD171BC7547CDDDA", hash_generated_method = "104842C33FA4333CD182A9724A0EA65D")
    @Override
    public void drawPoint(float x, float y, Paint paint) {
        addTaint(paint.getTaint());
        mPoint[0] = x;
        mPoint[1] = y;
        drawPoints(mPoint, 0, 2, paint);
        // ---------- Original Method ----------
        //mPoint[0] = x;
        //mPoint[1] = y;
        //drawPoints(mPoint, 0, 2, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.130 -0400", hash_original_method = "929DA853C72DCA36C1C2D5AEB0F0EEC1", hash_generated_method = "D8720D3F5332A17627233DE6797392EE")
    @Override
    public void drawPoints(float[] pts, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(pts[0]);
        drawPoints(pts, 0, pts.length, paint);
        // ---------- Original Method ----------
        //drawPoints(pts, 0, pts.length, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.130 -0400", hash_original_method = "A6EA0B46F26697457B201A425B5A3171", hash_generated_method = "49A13EAB6B8AA2817AAA24DBC57B4125")
    @Override
    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(count);
        addTaint(offset);
        addTaint(pts[0]);
        int modifiers = setupModifiers(paint);
        nDrawPoints(mRenderer, pts, offset, count, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //nDrawPoints(mRenderer, pts, offset, count, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawPoints(int renderer, float[] points,
            int offset, int count, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.130 -0400", hash_original_method = "A1D0375AE9DFF68E398CA7F0C8CFDC48", hash_generated_method = "74F0D723D9BB3291B080D9D7733878F0")
    @Override
    public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(pos[0]);
        addTaint(count);
        addTaint(index);
        addTaint(text[0]);
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.131 -0400", hash_original_method = "2727BD7310EB8AF1CE9C5E69FE8F5F77", hash_generated_method = "3B5DADF6F0A55064CE40FA5ED654E984")
    @Override
    public void drawPosText(String text, float[] pos, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(pos[0]);
        addTaint(text.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.131 -0400", hash_original_method = "1D1C68AD886616B8DD56E02894BED97B", hash_generated_method = "EBFA760F7E574D3C1D1EA5D3EA936C92")
    @Override
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(bottom);
        addTaint(right);
        addTaint(top);
        addTaint(left);
        int modifiers = setupModifiers(paint);
        nDrawRect(mRenderer, left, top, right, bottom, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //nDrawRect(mRenderer, left, top, right, bottom, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawRect(int renderer, float left, float top,
            float right, float bottom, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.132 -0400", hash_original_method = "9CB801DBEAF645326E64FD8725588653", hash_generated_method = "BBB6D5F4F6A6E2187C3A22EA5AD2D898")
    @Override
    public void drawRect(Rect r, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(r.getTaint());
        drawRect(r.left, r.top, r.right, r.bottom, paint);
        // ---------- Original Method ----------
        //drawRect(r.left, r.top, r.right, r.bottom, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.132 -0400", hash_original_method = "73D11F584AEBB7C191086A2FFF4052A9", hash_generated_method = "2D56321029DEE0E9DA970C32DEDE0DB8")
    @Override
    public void drawRect(RectF r, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(r.getTaint());
        drawRect(r.left, r.top, r.right, r.bottom, paint);
        // ---------- Original Method ----------
        //drawRect(r.left, r.top, r.right, r.bottom, paint);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.132 -0400", hash_original_method = "EB9FA3A1182306D8C56FD7B1B2A405F0", hash_generated_method = "E6088EADF0D68049F3FB32C7CFAAB75D")
    @Override
    public void drawRGB(int r, int g, int b) {
        addTaint(b);
        addTaint(g);
        addTaint(r);
        drawColor(0xFF000000 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF));
        // ---------- Original Method ----------
        //drawColor(0xFF000000 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF));
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.133 -0400", hash_original_method = "F66719DAB9BD4C7CE0890FFA1C26F9F2", hash_generated_method = "EBE2A06C5985DEEBDF554AF33DBE0BD1")
    @Override
    public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(ry);
        addTaint(rx);
        addTaint(rect.getTaint());
        int modifiers = setupModifiers(paint);
        nDrawRoundRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom,
                rx, ry, paint.mNativePaint);
        if(modifiers != MODIFIER_NONE)        
        nResetModifiers(mRenderer, modifiers);
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //nDrawRoundRect(mRenderer, rect.left, rect.top, rect.right, rect.bottom,
                //rx, ry, paint.mNativePaint);
        //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawRoundRect(int renderer, float left, float top,
            float right, float bottom, float rx, float y, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.134 -0400", hash_original_method = "5B66E40A85BEEB6F8228E5994A513667", hash_generated_method = "85E43D9DA8839DCA1FBCF88F66D99FB2")
    @Override
    public void drawText(char[] text, int index, int count, float x, float y, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(y);
        addTaint(x);
        addTaint(count);
        addTaint(index);
        addTaint(text[0]);
        if((index | count | (index + count) | (text.length - index - count)) < 0)        
        {
            IndexOutOfBoundsException varE4A00D3DB3B35ED0F12562B8AA17377A_1407835807 = new IndexOutOfBoundsException();
            varE4A00D3DB3B35ED0F12562B8AA17377A_1407835807.addTaint(taint);
            throw varE4A00D3DB3B35ED0F12562B8AA17377A_1407835807;
        } //End block
        int modifiers = setupModifiers(paint);
        try 
        {
            nDrawText(mRenderer, text, index, count, x, y, paint.mBidiFlags, paint.mNativePaint);
        } //End block
        finally 
        {
            if(modifiers != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifiers);
        } //End block
        // ---------- Original Method ----------
        //if ((index | count | (index + count) | (text.length - index - count)) < 0) {
            //throw new IndexOutOfBoundsException();
        //}
        //int modifiers = setupModifiers(paint);
        //try {
            //nDrawText(mRenderer, text, index, count, x, y, paint.mBidiFlags, paint.mNativePaint);
        //} finally {
            //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawText(int renderer, char[] text, int index, int count,
            float x, float y, int bidiFlags, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.135 -0400", hash_original_method = "BF4D02798081BBBF8269CD636760F070", hash_generated_method = "4190B9A7FFD780925A16CCBC8620D778")
    @Override
    public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(y);
        addTaint(x);
        addTaint(end);
        addTaint(start);
        addTaint(text.getTaint());
        int modifiers = setupModifiers(paint);
        try 
        {
            if(text instanceof String || text instanceof SpannedString ||
                    text instanceof SpannableString)            
            {
                nDrawText(mRenderer, text.toString(), start, end, x, y, paint.mBidiFlags,
                        paint.mNativePaint);
            } //End block
            else
            if(text instanceof GraphicsOperations)            
            {
                ((GraphicsOperations) text).drawText(this, start, end, x, y,
                                                         paint);
            } //End block
            else
            {
                char[] buf = TemporaryBuffer.obtain(end - start);
                TextUtils.getChars(text, start, end, buf, 0);
                nDrawText(mRenderer, buf, 0, end - start, x, y,
                        paint.mBidiFlags, paint.mNativePaint);
                TemporaryBuffer.recycle(buf);
            } //End block
        } //End block
        finally 
        {
            if(modifiers != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifiers);
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.135 -0400", hash_original_method = "53AB28ACA34BAB18CDB1722B92273EEB", hash_generated_method = "F52C485373E077010ECFC64185AF75F2")
    @Override
    public void drawText(String text, int start, int end, float x, float y, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(y);
        addTaint(x);
        addTaint(end);
        addTaint(start);
        addTaint(text.getTaint());
        if((start | end | (end - start) | (text.length() - end)) < 0)        
        {
            IndexOutOfBoundsException varE4A00D3DB3B35ED0F12562B8AA17377A_126120784 = new IndexOutOfBoundsException();
            varE4A00D3DB3B35ED0F12562B8AA17377A_126120784.addTaint(taint);
            throw varE4A00D3DB3B35ED0F12562B8AA17377A_126120784;
        } //End block
        int modifiers = setupModifiers(paint);
        try 
        {
            nDrawText(mRenderer, text, start, end, x, y, paint.mBidiFlags, paint.mNativePaint);
        } //End block
        finally 
        {
            if(modifiers != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifiers);
        } //End block
        // ---------- Original Method ----------
        //if ((start | end | (end - start) | (text.length() - end)) < 0) {
            //throw new IndexOutOfBoundsException();
        //}
        //int modifiers = setupModifiers(paint);
        //try {
            //nDrawText(mRenderer, text, start, end, x, y, paint.mBidiFlags, paint.mNativePaint);
        //} finally {
            //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawText(int renderer, String text, int start, int end,
            float x, float y, int bidiFlags, int paint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.138 -0400", hash_original_method = "F496E99287218708FCCC7DBE6218BF00", hash_generated_method = "6560B7EB5B7762580F8F9561797E38B3")
    @Override
    public void drawText(String text, float x, float y, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(y);
        addTaint(x);
        addTaint(text.getTaint());
        int modifiers = setupModifiers(paint);
        try 
        {
            nDrawText(mRenderer, text, 0, text.length(), x, y, paint.mBidiFlags,
                    paint.mNativePaint);
        } //End block
        finally 
        {
            if(modifiers != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifiers);
        } //End block
        // ---------- Original Method ----------
        //int modifiers = setupModifiers(paint);
        //try {
            //nDrawText(mRenderer, text, 0, text.length(), x, y, paint.mBidiFlags,
                    //paint.mNativePaint);
        //} finally {
            //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.138 -0400", hash_original_method = "C2D0F05CD306BD6EB45BAEA1052EFD68", hash_generated_method = "7D8A930ECBDC214A71CEB1EEC14B63CC")
    @Override
    public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset,
            float vOffset, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(vOffset);
        addTaint(hOffset);
        addTaint(path.getTaint());
        addTaint(count);
        addTaint(index);
        addTaint(text[0]);
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.138 -0400", hash_original_method = "E399416700F7228806FC79CB70E6A478", hash_generated_method = "E3492886BB57304B70F3B7BCD2D166B4")
    @Override
    public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(vOffset);
        addTaint(hOffset);
        addTaint(path.getTaint());
        addTaint(text.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.141 -0400", hash_original_method = "8FBF947B147B7DB5ED34E606F7095E1C", hash_generated_method = "7D4845C3A2EB21C3478650EDBAE3A8BD")
    @Override
    public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount,
            float x, float y, int dir, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(dir);
        addTaint(y);
        addTaint(x);
        addTaint(contextCount);
        addTaint(contextIndex);
        addTaint(count);
        addTaint(index);
        addTaint(text[0]);
        if((index | count | text.length - index - count) < 0)        
        {
            IndexOutOfBoundsException varE4A00D3DB3B35ED0F12562B8AA17377A_1548556884 = new IndexOutOfBoundsException();
            varE4A00D3DB3B35ED0F12562B8AA17377A_1548556884.addTaint(taint);
            throw varE4A00D3DB3B35ED0F12562B8AA17377A_1548556884;
        } //End block
        if(dir != DIRECTION_LTR && dir != DIRECTION_RTL)        
        {
            IllegalArgumentException varA7697A0B8843DFFB67E3CBA4DDE8EAF9_377472778 = new IllegalArgumentException("Unknown direction: " + dir);
            varA7697A0B8843DFFB67E3CBA4DDE8EAF9_377472778.addTaint(taint);
            throw varA7697A0B8843DFFB67E3CBA4DDE8EAF9_377472778;
        } //End block
        int modifiers = setupModifiers(paint);
        try 
        {
            nDrawTextRun(mRenderer, text, index, count, contextIndex, contextCount, x, y, dir,
                    paint.mNativePaint);
        } //End block
        finally 
        {
            if(modifiers != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifiers);
        } //End block
        // ---------- Original Method ----------
        //if ((index | count | text.length - index - count) < 0) {
            //throw new IndexOutOfBoundsException();
        //}
        //if (dir != DIRECTION_LTR && dir != DIRECTION_RTL) {
            //throw new IllegalArgumentException("Unknown direction: " + dir);
        //}
        //int modifiers = setupModifiers(paint);
        //try {
            //nDrawTextRun(mRenderer, text, index, count, contextIndex, contextCount, x, y, dir,
                    //paint.mNativePaint);
        //} finally {
            //if (modifiers != MODIFIER_NONE) nResetModifiers(mRenderer, modifiers);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawTextRun(int renderer, char[] text, int index, int count,
            int contextIndex, int contextCount, float x, float y, int dir, int nativePaint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.142 -0400", hash_original_method = "7904538C4B6BCEBBAA348BC3E2FD272F", hash_generated_method = "6DF3707AF3BEB0B6DA4EAB0FAEDB3405")
    @Override
    public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd,
            float x, float y, int dir, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(dir);
        addTaint(y);
        addTaint(x);
        addTaint(contextEnd);
        addTaint(contextStart);
        addTaint(end);
        addTaint(start);
        addTaint(text.getTaint());
        if((start | end | end - start | text.length() - end) < 0)        
        {
            IndexOutOfBoundsException varE4A00D3DB3B35ED0F12562B8AA17377A_1826048695 = new IndexOutOfBoundsException();
            varE4A00D3DB3B35ED0F12562B8AA17377A_1826048695.addTaint(taint);
            throw varE4A00D3DB3B35ED0F12562B8AA17377A_1826048695;
        } //End block
        int modifiers = setupModifiers(paint);
        try 
        {
            int flags = dir == 0 ? 0 : 1;
            if(text instanceof String || text instanceof SpannedString ||
                    text instanceof SpannableString)            
            {
                nDrawTextRun(mRenderer, text.toString(), start, end, contextStart,
                        contextEnd, x, y, flags, paint.mNativePaint);
            } //End block
            else
            if(text instanceof GraphicsOperations)            
            {
                ((GraphicsOperations) text).drawTextRun(this, start, end,
                        contextStart, contextEnd, x, y, flags, paint);
            } //End block
            else
            {
                int contextLen = contextEnd - contextStart;
                int len = end - start;
                char[] buf = TemporaryBuffer.obtain(contextLen);
                TextUtils.getChars(text, contextStart, contextEnd, buf, 0);
                nDrawTextRun(mRenderer, buf, start - contextStart, len, 0, contextLen,
                        x, y, flags, paint.mNativePaint);
                TemporaryBuffer.recycle(buf);
            } //End block
        } //End block
        finally 
        {
            if(modifiers != MODIFIER_NONE)            
            nResetModifiers(mRenderer, modifiers);
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    private static void nDrawTextRun(int renderer, String text, int start, int end,
            int contextStart, int contextEnd, float x, float y, int flags, int nativePaint) {
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.142 -0400", hash_original_method = "7C5BB6E42A47B8FFC1224CB48EC5DC66", hash_generated_method = "40DFC169A693775C01A0188AE9FF9AE3")
    @Override
    public void drawVertices(VertexMode mode, int vertexCount, float[] verts, int vertOffset,
            float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices,
            int indexOffset, int indexCount, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(indexCount);
        addTaint(indexOffset);
        addTaint(indices[0]);
        addTaint(colorOffset);
        addTaint(colors[0]);
        addTaint(texOffset);
        addTaint(texs[0]);
        addTaint(vertOffset);
        addTaint(verts[0]);
        addTaint(vertexCount);
        addTaint(mode.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.142 -0400", hash_original_method = "5D6688C2A74D4FFF4670B4EAAE2F407B", hash_generated_method = "84F0683C6F86D677D7CA4C21EFB15C14")
    private int setupModifiers(Bitmap b, Paint paint) {
        addTaint(paint.getTaint());
        addTaint(b.getTaint());
        if(b.getConfig() == Bitmap.Config.ALPHA_8)        
        {
            int var413027AD41BF7545DCB2F18DFA7EE08B_22762201 = (setupModifiers(paint));
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_834774433 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_834774433;
        } //End block
        final ColorFilter filter = paint.getColorFilter();
        if(filter != null)        
        {
            nSetupColorFilter(mRenderer, filter.nativeColorFilter);
            int varD644E26BA3F8E16EA7B54364F3EC7563_1972567936 = (MODIFIER_COLOR_FILTER);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_98950932 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_98950932;
        } //End block
        int var14EC4C6E987AFE92EEB1024593A6AD22_2006947967 = (MODIFIER_NONE);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2113040952 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2113040952;
        // ---------- Original Method ----------
        //if (b.getConfig() == Bitmap.Config.ALPHA_8) {
            //return setupModifiers(paint);
        //}
        //final ColorFilter filter = paint.getColorFilter();
        //if (filter != null) {
            //nSetupColorFilter(mRenderer, filter.nativeColorFilter);
            //return MODIFIER_COLOR_FILTER;
        //}
        //return MODIFIER_NONE;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.143 -0400", hash_original_method = "7663D59B2E312EB2A24D959BD08A0BC2", hash_generated_method = "AE45222CE9E7C0DABC13DDF4FC709B66")
    private int setupModifiers(Paint paint) {
        addTaint(paint.getTaint());
        int modifiers = MODIFIER_NONE;
        if(paint.hasShadow)        
        {
            nSetupShadow(mRenderer, paint.shadowRadius, paint.shadowDx, paint.shadowDy,
                    paint.shadowColor);
            modifiers |= MODIFIER_SHADOW;
        } //End block
        final Shader shader = paint.getShader();
        if(shader != null)        
        {
            nSetupShader(mRenderer, shader.native_shader);
            modifiers |= MODIFIER_SHADER;
        } //End block
        final ColorFilter filter = paint.getColorFilter();
        if(filter != null)        
        {
            nSetupColorFilter(mRenderer, filter.nativeColorFilter);
            modifiers |= MODIFIER_COLOR_FILTER;
        } //End block
        int varBF24B44A8CC99E648657B164C8ABA758_2059222445 = (modifiers);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_128387392 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_128387392;
        // ---------- Original Method ----------
        //int modifiers = MODIFIER_NONE;
        //if (paint.hasShadow) {
            //nSetupShadow(mRenderer, paint.shadowRadius, paint.shadowDx, paint.shadowDy,
                    //paint.shadowColor);
            //modifiers |= MODIFIER_SHADOW;
        //}
        //final Shader shader = paint.getShader();
        //if (shader != null) {
            //nSetupShader(mRenderer, shader.native_shader);
            //modifiers |= MODIFIER_SHADER;
        //}
        //final ColorFilter filter = paint.getColorFilter();
        //if (filter != null) {
            //nSetupColorFilter(mRenderer, filter.nativeColorFilter);
            //modifiers |= MODIFIER_COLOR_FILTER;
        //}
        //return modifiers;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.143 -0400", hash_original_method = "8D8D130B420F7BDB77245347422EB674", hash_generated_method = "A82B04023BE27F03E9F8FC2943A68AF9")
    private int setupColorFilter(Paint paint) {
        addTaint(paint.getTaint());
        final ColorFilter filter = paint.getColorFilter();
        if(filter != null)        
        {
            nSetupColorFilter(mRenderer, filter.nativeColorFilter);
            int varD644E26BA3F8E16EA7B54364F3EC7563_1538594391 = (MODIFIER_COLOR_FILTER);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1041748828 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1041748828;
        } //End block
        int var14EC4C6E987AFE92EEB1024593A6AD22_1197789609 = (MODIFIER_NONE);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_237072334 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_237072334;
        // ---------- Original Method ----------
        //final ColorFilter filter = paint.getColorFilter();
        //if (filter != null) {
            //nSetupColorFilter(mRenderer, filter.nativeColorFilter);
            //return MODIFIER_COLOR_FILTER;
        //}
        //return MODIFIER_NONE;
    }

    
    @DSModeled(DSC.SAFE)
    private static void nSetupShader(int renderer, int shader) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nSetupColorFilter(int renderer, int colorFilter) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nSetupShadow(int renderer, float radius,
            float dx, float dy, int color) {
    }

    
    @DSModeled(DSC.SAFE)
    private static void nResetModifiers(int renderer, int modifiers) {
    }

    
    private static final class CanvasFinalizer {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.146 -0400", hash_original_field = "D9CFA901A96C28EEA9DD412429CB9486", hash_generated_field = "29611ED2287CE69051FC2BCDB2E2FF9D")

        private int mRenderer;
        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.146 -0400", hash_original_method = "FD0EABF3A28C8F1A6C7AE1792F2A951E", hash_generated_method = "F4CE774395766560B3604C2271BA47E5")
        public  CanvasFinalizer(int renderer) {
            mRenderer = renderer;
            // ---------- Original Method ----------
            //mRenderer = renderer;
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_method = "98F8E6E4208DCA7352053ED1AE5E9232", hash_generated_method = "172B7210461BDF8CBEDEDD56AE7B7486")
        @Override
        protected void finalize() throws Throwable {
            try 
            {
                nDestroyRenderer(mRenderer);
            } //End block
            finally 
            {
                super.finalize();
            } //End block
            // ---------- Original Method ----------
            //try {
                //nDestroyRenderer(mRenderer);
            //} finally {
                //super.finalize();
            //}
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "724AEEA405FC9CF2CE47243A92797113", hash_generated_field = "E2BA09F8DF55E2B4054F568E93987B59")

    private static final int MODIFIER_NONE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "94B729010A95D20E8C197B93E2E6F8D5", hash_generated_field = "F3A096D0EBF980761DC223D5B61BA142")

    private static final int MODIFIER_SHADOW = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "0CA6B43DD1E03498AF4D707A3E3A166E", hash_generated_field = "A17A6835293DC1FAD5B4BD9C6992B819")

    private static final int MODIFIER_SHADER = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "8F247A4C1EFB8B21D56F5A549AF04510", hash_generated_field = "2EFB036221198641F88AC422E6AE703C")

    private static final int MODIFIER_COLOR_FILTER = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "311BEA3B2ABE4D5421B92A22977E6ED9", hash_generated_field = "00CB76E41029EE5E99449BE03B14A2C4")

    private static boolean sIsAvailable = nIsAvailable();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "2D3E4E15F2A351552D65553739390E48", hash_generated_field = "ABDEA563561F2E851E5FA87E2946EA62")

    public static final int FLUSH_CACHES_LAYERS = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "CC12B1F5538FD6E6A924A110A43464C3", hash_generated_field = "862324F027832C57FCA1F817DF8CFB81")

    public static final int FLUSH_CACHES_MODERATE = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:42.147 -0400", hash_original_field = "3137DA4124C142EF7060FF3E7E058DC0", hash_generated_field = "868D2688FA6966D15281F70A2C218ADD")

    public static final int FLUSH_CACHES_FULL = 2;
}

