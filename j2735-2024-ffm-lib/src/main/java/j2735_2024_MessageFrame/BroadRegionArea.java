// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct BroadRegionArea {
 *     BroadRegionArea_PR present;
 *     union BroadRegionArea_u {
 *         RSMPolygon_t polygon;
 *         Circle_t circle;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class BroadRegionArea {

    BroadRegionArea() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("present"),
        MemoryLayout.paddingLayout(4),
        BroadRegionArea_u.layout().withName("choice"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("BroadRegionArea");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt present$LAYOUT = (OfInt)$LAYOUT.select(groupElement("present"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BroadRegionArea_PR present
     * }
     */
    public static final OfInt present$layout() {
        return present$LAYOUT;
    }

    private static final long present$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BroadRegionArea_PR present
     * }
     */
    public static final long present$offset() {
        return present$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BroadRegionArea_PR present
     * }
     */
    public static int present(MemorySegment struct) {
        return struct.get(present$LAYOUT, present$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BroadRegionArea_PR present
     * }
     */
    public static void present(MemorySegment struct, int fieldValue) {
        struct.set(present$LAYOUT, present$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union BroadRegionArea_u {
     *     RSMPolygon_t polygon;
     *     Circle_t circle;
     * }
     * }
     */
    public static class BroadRegionArea_u {

        BroadRegionArea_u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            RSMPolygon.layout().withName("polygon"),
            Circle.layout().withName("circle")
        ).withName("BroadRegionArea_u");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout polygon$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("polygon"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * RSMPolygon_t polygon
         * }
         */
        public static final GroupLayout polygon$layout() {
            return polygon$LAYOUT;
        }

        private static final long polygon$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * RSMPolygon_t polygon
         * }
         */
        public static final long polygon$offset() {
            return polygon$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * RSMPolygon_t polygon
         * }
         */
        public static MemorySegment polygon(MemorySegment union) {
            return union.asSlice(polygon$OFFSET, polygon$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * RSMPolygon_t polygon
         * }
         */
        public static void polygon(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, polygon$OFFSET, polygon$LAYOUT.byteSize());
        }

        private static final GroupLayout circle$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("circle"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Circle_t circle
         * }
         */
        public static final GroupLayout circle$layout() {
            return circle$LAYOUT;
        }

        private static final long circle$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Circle_t circle
         * }
         */
        public static final long circle$offset() {
            return circle$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Circle_t circle
         * }
         */
        public static MemorySegment circle(MemorySegment union) {
            return union.asSlice(circle$OFFSET, circle$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Circle_t circle
         * }
         */
        public static void circle(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, circle$OFFSET, circle$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout choice$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("choice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union BroadRegionArea_u choice
     * }
     */
    public static final GroupLayout choice$layout() {
        return choice$LAYOUT;
    }

    private static final long choice$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union BroadRegionArea_u choice
     * }
     */
    public static final long choice$offset() {
        return choice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union BroadRegionArea_u choice
     * }
     */
    public static MemorySegment choice(MemorySegment struct) {
        return struct.asSlice(choice$OFFSET, choice$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union BroadRegionArea_u choice
     * }
     */
    public static void choice(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, choice$OFFSET, choice$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 104;

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
