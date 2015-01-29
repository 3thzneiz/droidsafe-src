package android.database;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;

public class CursorWindowAllocationException extends RuntimeException {
    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:45.874 -0500", hash_original_method = "643AF47320B69D20A3CAAFE0EBF7408E", hash_generated_method = "7D4B5F28356D6E800A0AEB9AFA23ED88")
    
public CursorWindowAllocationException(String description) {
        super(description);
    }
    
}
