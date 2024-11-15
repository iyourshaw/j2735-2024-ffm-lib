// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct asn_TYPE_member_s {
 *     enum asn_TYPE_flags_e flags;
 *     unsigned int optional;
 *     unsigned int memb_offset;
 *     ber_tlv_tag_t tag;
 *     int tag_mode;
 *     asn_TYPE_descriptor_t *type;
 *     asn_type_selector_f *type_selector;
 *     asn_encoding_constraints_t encoding_constraints;
 *     int (*default_value_cmp)(const void *);
 *     int (*default_value_set)(void **);
 *     const char *name;
 * }
 * }
 */
public class asn_TYPE_member_s {

    asn_TYPE_member_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("flags"),
        MessageFrame_h.C_INT.withName("optional"),
        MessageFrame_h.C_INT.withName("memb_offset"),
        MessageFrame_h.C_INT.withName("tag"),
        MessageFrame_h.C_INT.withName("tag_mode"),
        MemoryLayout.paddingLayout(4),
        MessageFrame_h.C_POINTER.withName("type"),
        MessageFrame_h.C_POINTER.withName("type_selector"),
        asn_encoding_constraints_s.layout().withName("encoding_constraints"),
        MessageFrame_h.C_POINTER.withName("default_value_cmp"),
        MessageFrame_h.C_POINTER.withName("default_value_set"),
        MessageFrame_h.C_POINTER.withName("name")
    ).withName("asn_TYPE_member_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum asn_TYPE_flags_e flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum asn_TYPE_flags_e flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum asn_TYPE_flags_e flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum asn_TYPE_flags_e flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final OfInt optional$LAYOUT = (OfInt)$LAYOUT.select(groupElement("optional"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int optional
     * }
     */
    public static final OfInt optional$layout() {
        return optional$LAYOUT;
    }

    private static final long optional$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int optional
     * }
     */
    public static final long optional$offset() {
        return optional$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int optional
     * }
     */
    public static int optional(MemorySegment struct) {
        return struct.get(optional$LAYOUT, optional$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int optional
     * }
     */
    public static void optional(MemorySegment struct, int fieldValue) {
        struct.set(optional$LAYOUT, optional$OFFSET, fieldValue);
    }

    private static final OfInt memb_offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("memb_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int memb_offset
     * }
     */
    public static final OfInt memb_offset$layout() {
        return memb_offset$LAYOUT;
    }

    private static final long memb_offset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int memb_offset
     * }
     */
    public static final long memb_offset$offset() {
        return memb_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int memb_offset
     * }
     */
    public static int memb_offset(MemorySegment struct) {
        return struct.get(memb_offset$LAYOUT, memb_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int memb_offset
     * }
     */
    public static void memb_offset(MemorySegment struct, int fieldValue) {
        struct.set(memb_offset$LAYOUT, memb_offset$OFFSET, fieldValue);
    }

    private static final OfInt tag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ber_tlv_tag_t tag
     * }
     */
    public static final OfInt tag$layout() {
        return tag$LAYOUT;
    }

    private static final long tag$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ber_tlv_tag_t tag
     * }
     */
    public static final long tag$offset() {
        return tag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ber_tlv_tag_t tag
     * }
     */
    public static int tag(MemorySegment struct) {
        return struct.get(tag$LAYOUT, tag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ber_tlv_tag_t tag
     * }
     */
    public static void tag(MemorySegment struct, int fieldValue) {
        struct.set(tag$LAYOUT, tag$OFFSET, fieldValue);
    }

    private static final OfInt tag_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tag_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tag_mode
     * }
     */
    public static final OfInt tag_mode$layout() {
        return tag_mode$LAYOUT;
    }

    private static final long tag_mode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tag_mode
     * }
     */
    public static final long tag_mode$offset() {
        return tag_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tag_mode
     * }
     */
    public static int tag_mode(MemorySegment struct) {
        return struct.get(tag_mode$LAYOUT, tag_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tag_mode
     * }
     */
    public static void tag_mode(MemorySegment struct, int fieldValue) {
        struct.set(tag_mode$LAYOUT, tag_mode$OFFSET, fieldValue);
    }

    private static final AddressLayout type$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_TYPE_descriptor_t *type
     * }
     */
    public static final AddressLayout type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_TYPE_descriptor_t *type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_TYPE_descriptor_t *type
     * }
     */
    public static MemorySegment type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_TYPE_descriptor_t *type
     * }
     */
    public static void type(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout type_selector$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("type_selector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_type_selector_f *type_selector
     * }
     */
    public static final AddressLayout type_selector$layout() {
        return type_selector$LAYOUT;
    }

    private static final long type_selector$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_type_selector_f *type_selector
     * }
     */
    public static final long type_selector$offset() {
        return type_selector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_type_selector_f *type_selector
     * }
     */
    public static MemorySegment type_selector(MemorySegment struct) {
        return struct.get(type_selector$LAYOUT, type_selector$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_type_selector_f *type_selector
     * }
     */
    public static void type_selector(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(type_selector$LAYOUT, type_selector$OFFSET, fieldValue);
    }

    private static final GroupLayout encoding_constraints$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("encoding_constraints"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_encoding_constraints_t encoding_constraints
     * }
     */
    public static final GroupLayout encoding_constraints$layout() {
        return encoding_constraints$LAYOUT;
    }

    private static final long encoding_constraints$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_encoding_constraints_t encoding_constraints
     * }
     */
    public static final long encoding_constraints$offset() {
        return encoding_constraints$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_encoding_constraints_t encoding_constraints
     * }
     */
    public static MemorySegment encoding_constraints(MemorySegment struct) {
        return struct.asSlice(encoding_constraints$OFFSET, encoding_constraints$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_encoding_constraints_t encoding_constraints
     * }
     */
    public static void encoding_constraints(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, encoding_constraints$OFFSET, encoding_constraints$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * int (*default_value_cmp)(const void *)
     * }
     */
    public static class default_value_cmp {

        default_value_cmp() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            MessageFrame_h.C_INT,
            MessageFrame_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = MessageFrame_h.upcallHandle(Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout default_value_cmp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("default_value_cmp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*default_value_cmp)(const void *)
     * }
     */
    public static final AddressLayout default_value_cmp$layout() {
        return default_value_cmp$LAYOUT;
    }

    private static final long default_value_cmp$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*default_value_cmp)(const void *)
     * }
     */
    public static final long default_value_cmp$offset() {
        return default_value_cmp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*default_value_cmp)(const void *)
     * }
     */
    public static MemorySegment default_value_cmp(MemorySegment struct) {
        return struct.get(default_value_cmp$LAYOUT, default_value_cmp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*default_value_cmp)(const void *)
     * }
     */
    public static void default_value_cmp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(default_value_cmp$LAYOUT, default_value_cmp$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * int (*default_value_set)(void **)
     * }
     */
    public static class default_value_set {

        default_value_set() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            MessageFrame_h.C_INT,
            MessageFrame_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = MessageFrame_h.upcallHandle(Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout default_value_set$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("default_value_set"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int (*default_value_set)(void **)
     * }
     */
    public static final AddressLayout default_value_set$layout() {
        return default_value_set$LAYOUT;
    }

    private static final long default_value_set$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int (*default_value_set)(void **)
     * }
     */
    public static final long default_value_set$offset() {
        return default_value_set$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int (*default_value_set)(void **)
     * }
     */
    public static MemorySegment default_value_set(MemorySegment struct) {
        return struct.get(default_value_set$LAYOUT, default_value_set$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int (*default_value_set)(void **)
     * }
     */
    public static void default_value_set(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(default_value_set$LAYOUT, default_value_set$OFFSET, fieldValue);
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

