// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;

/**
 * {@snippet lang=c :
 * typedef asn_dec_rval_t (ber_type_decoder_f)(const struct asn_codec_ctx_s {
 *     size_t max_stack_size;
 * } *, const struct asn_TYPE_descriptor_s {
 *     const char *name;
 *     const char *xml_tag;
 *     asn_TYPE_operation_t *op;
 *     const ber_tlv_tag_t *tags;
 *     unsigned int tags_count;
 *     const ber_tlv_tag_t *all_tags;
 *     unsigned int all_tags_count;
 *     asn_encoding_constraints_t encoding_constraints;
 *     struct asn_TYPE_member_s *elements;
 *     unsigned int elements_count;
 *     const void *specifics;
 * } *, void **, const void *, size_t, int)
 * }
 */
public class ber_type_decoder_f {

    ber_type_decoder_f() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        MemorySegment apply(MemorySegment opt_codec_ctx, MemorySegment type_descriptor, MemorySegment struct_ptr, MemorySegment buf_ptr, long size, int tag_mode);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        asn_dec_rval_s.layout(),
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_POINTER,
        MessageFrame_h.C_LONG,
        MessageFrame_h.C_INT
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
    public static MemorySegment invoke(MemorySegment funcPtr, SegmentAllocator alloc,MemorySegment opt_codec_ctx, MemorySegment type_descriptor, MemorySegment struct_ptr, MemorySegment buf_ptr, long size, int tag_mode) {
        try {
            return (MemorySegment) DOWN$MH.invokeExact(funcPtr, alloc, opt_codec_ctx, type_descriptor, struct_ptr, buf_ptr, size, tag_mode);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

