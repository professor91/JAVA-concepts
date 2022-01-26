public class n_package_access {
    
}

//                                  Private      No Modifier      Protected      Public

// Same class                       Yes          Yes              Yes            Yes
// Same package subclass            No           Yes              Yes            Yes
// Same package non-subclass        No           Yes              Yes            Yes
// different package subclass       No           No               Yes            Yes
// Different package non-subclass   No           No               No             Yes
