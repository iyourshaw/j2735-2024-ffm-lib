// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RptHysteresis {
 *     DTime_t time;
 *     Position3D_t position;
 *     struct PositionalAccuracy *positionalAccuracy;
 *     RptVelocity_t velocity;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RptHysteresis {

    RptHysteresis() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DTime.layout().withName("time"),
        Position3D.layout().withName("position"),
        MessageFrame_h.C_POINTER.withName("positionalAccuracy"),
        RptVelocity.layout().withName("velocity"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RptHysteresis");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout time$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DTime_t time
     * }
     */
    public static final GroupLayout time$layout() {
        return time$LAYOUT;
    }

    private static final long time$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DTime_t time
     * }
     */
    public static final long time$offset() {
        return time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DTime_t time
     * }
     */
    public static MemorySegment time(MemorySegment struct) {
        return struct.asSlice(time$OFFSET, time$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DTime_t time
     * }
     */
    public static void time(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, time$OFFSET, time$LAYOUT.byteSize());
    }

    private static final GroupLayout position$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static final GroupLayout position$layout() {
        return position$LAYOUT;
    }

    private static final long position$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static final long position$offset() {
        return position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static MemorySegment position(MemorySegment struct) {
        return struct.asSlice(position$OFFSET, position$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static void position(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, position$OFFSET, position$LAYOUT.byteSize());
    }

    private static final AddressLayout positionalAccuracy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("positionalAccuracy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PositionalAccuracy *positionalAccuracy
     * }
     */
    public static final AddressLayout positionalAccuracy$layout() {
        return positionalAccuracy$LAYOUT;
    }

    private static final long positionalAccuracy$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PositionalAccuracy *positionalAccuracy
     * }
     */
    public static final long positionalAccuracy$offset() {
        return positionalAccuracy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PositionalAccuracy *positionalAccuracy
     * }
     */
    public static MemorySegment positionalAccuracy(MemorySegment struct) {
        return struct.get(positionalAccuracy$LAYOUT, positionalAccuracy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PositionalAccuracy *positionalAccuracy
     * }
     */
    public static void positionalAccuracy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(positionalAccuracy$LAYOUT, positionalAccuracy$OFFSET, fieldValue);
    }

    private static final GroupLayout velocity$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("velocity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static final GroupLayout velocity$layout() {
        return velocity$LAYOUT;
    }

    private static final long velocity$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static final long velocity$offset() {
        return velocity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static MemorySegment velocity(MemorySegment struct) {
        return struct.asSlice(velocity$OFFSET, velocity$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RptVelocity_t velocity
     * }
     */
    public static void velocity(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, velocity$OFFSET, velocity$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 168;

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

