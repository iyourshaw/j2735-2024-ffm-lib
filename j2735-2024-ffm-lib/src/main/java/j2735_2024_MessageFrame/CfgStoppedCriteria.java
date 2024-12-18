// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct CfgStoppedCriteria {
 *     long stoppedSpeedThreshold;
 *     long amountOfTimeBelow;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class CfgStoppedCriteria {

    CfgStoppedCriteria() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("stoppedSpeedThreshold"),
        MessageFrame_h.C_LONG.withName("amountOfTimeBelow"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("CfgStoppedCriteria");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong stoppedSpeedThreshold$LAYOUT = (OfLong)$LAYOUT.select(groupElement("stoppedSpeedThreshold"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long stoppedSpeedThreshold
     * }
     */
    public static final OfLong stoppedSpeedThreshold$layout() {
        return stoppedSpeedThreshold$LAYOUT;
    }

    private static final long stoppedSpeedThreshold$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long stoppedSpeedThreshold
     * }
     */
    public static final long stoppedSpeedThreshold$offset() {
        return stoppedSpeedThreshold$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long stoppedSpeedThreshold
     * }
     */
    public static long stoppedSpeedThreshold(MemorySegment struct) {
        return struct.get(stoppedSpeedThreshold$LAYOUT, stoppedSpeedThreshold$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long stoppedSpeedThreshold
     * }
     */
    public static void stoppedSpeedThreshold(MemorySegment struct, long fieldValue) {
        struct.set(stoppedSpeedThreshold$LAYOUT, stoppedSpeedThreshold$OFFSET, fieldValue);
    }

    private static final OfLong amountOfTimeBelow$LAYOUT = (OfLong)$LAYOUT.select(groupElement("amountOfTimeBelow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long amountOfTimeBelow
     * }
     */
    public static final OfLong amountOfTimeBelow$layout() {
        return amountOfTimeBelow$LAYOUT;
    }

    private static final long amountOfTimeBelow$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long amountOfTimeBelow
     * }
     */
    public static final long amountOfTimeBelow$offset() {
        return amountOfTimeBelow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long amountOfTimeBelow
     * }
     */
    public static long amountOfTimeBelow(MemorySegment struct) {
        return struct.get(amountOfTimeBelow$LAYOUT, amountOfTimeBelow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long amountOfTimeBelow
     * }
     */
    public static void amountOfTimeBelow(MemorySegment struct, long fieldValue) {
        struct.set(amountOfTimeBelow$LAYOUT, amountOfTimeBelow$OFFSET, fieldValue);
    }

    private static final GroupLayout _asn_ctx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_asn_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final GroupLayout _asn_ctx$layout() {
        return _asn_ctx$LAYOUT;
    }

    private static final long _asn_ctx$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final long _asn_ctx$offset() {
        return _asn_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static MemorySegment _asn_ctx(MemorySegment struct) {
        return struct.asSlice(_asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static void _asn_ctx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
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

