// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct NodeOffsetPointXY {
 *     NodeOffsetPointXY_PR present;
 *     union NodeOffsetPointXY_u {
 *         Node_XY_20b_t node_XY1;
 *         Node_XY_22b_t node_XY2;
 *         Node_XY_24b_t node_XY3;
 *         Node_XY_26b_t node_XY4;
 *         Node_XY_28b_t node_XY5;
 *         Node_XY_32b_t node_XY6;
 *         Node_LLmD_64b_t node_LatLon;
 *         NodeOffsetPointXY__regional_t regional;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class NodeOffsetPointXY {

    NodeOffsetPointXY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("present"),
        MemoryLayout.paddingLayout(4),
        NodeOffsetPointXY_u.layout().withName("choice"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("NodeOffsetPointXY");

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
     * NodeOffsetPointXY_PR present
     * }
     */
    public static final OfInt present$layout() {
        return present$LAYOUT;
    }

    private static final long present$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NodeOffsetPointXY_PR present
     * }
     */
    public static final long present$offset() {
        return present$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NodeOffsetPointXY_PR present
     * }
     */
    public static int present(MemorySegment struct) {
        return struct.get(present$LAYOUT, present$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NodeOffsetPointXY_PR present
     * }
     */
    public static void present(MemorySegment struct, int fieldValue) {
        struct.set(present$LAYOUT, present$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union NodeOffsetPointXY_u {
     *     Node_XY_20b_t node_XY1;
     *     Node_XY_22b_t node_XY2;
     *     Node_XY_24b_t node_XY3;
     *     Node_XY_26b_t node_XY4;
     *     Node_XY_28b_t node_XY5;
     *     Node_XY_32b_t node_XY6;
     *     Node_LLmD_64b_t node_LatLon;
     *     NodeOffsetPointXY__regional_t regional;
     * }
     * }
     */
    public static class NodeOffsetPointXY_u {

        NodeOffsetPointXY_u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Node_XY_20b.layout().withName("node_XY1"),
            Node_XY_22b.layout().withName("node_XY2"),
            Node_XY_24b.layout().withName("node_XY3"),
            Node_XY_26b.layout().withName("node_XY4"),
            Node_XY_28b.layout().withName("node_XY5"),
            Node_XY_32b.layout().withName("node_XY6"),
            Node_LLmD_64b.layout().withName("node_LatLon"),
            NodeOffsetPointXY__regional.layout().withName("regional")
        ).withName("NodeOffsetPointXY_u");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout node_XY1$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_XY1"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_XY_20b_t node_XY1
         * }
         */
        public static final GroupLayout node_XY1$layout() {
            return node_XY1$LAYOUT;
        }

        private static final long node_XY1$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_XY_20b_t node_XY1
         * }
         */
        public static final long node_XY1$offset() {
            return node_XY1$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_XY_20b_t node_XY1
         * }
         */
        public static MemorySegment node_XY1(MemorySegment union) {
            return union.asSlice(node_XY1$OFFSET, node_XY1$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_XY_20b_t node_XY1
         * }
         */
        public static void node_XY1(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_XY1$OFFSET, node_XY1$LAYOUT.byteSize());
        }

        private static final GroupLayout node_XY2$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_XY2"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_XY_22b_t node_XY2
         * }
         */
        public static final GroupLayout node_XY2$layout() {
            return node_XY2$LAYOUT;
        }

        private static final long node_XY2$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_XY_22b_t node_XY2
         * }
         */
        public static final long node_XY2$offset() {
            return node_XY2$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_XY_22b_t node_XY2
         * }
         */
        public static MemorySegment node_XY2(MemorySegment union) {
            return union.asSlice(node_XY2$OFFSET, node_XY2$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_XY_22b_t node_XY2
         * }
         */
        public static void node_XY2(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_XY2$OFFSET, node_XY2$LAYOUT.byteSize());
        }

        private static final GroupLayout node_XY3$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_XY3"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_XY_24b_t node_XY3
         * }
         */
        public static final GroupLayout node_XY3$layout() {
            return node_XY3$LAYOUT;
        }

        private static final long node_XY3$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_XY_24b_t node_XY3
         * }
         */
        public static final long node_XY3$offset() {
            return node_XY3$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_XY_24b_t node_XY3
         * }
         */
        public static MemorySegment node_XY3(MemorySegment union) {
            return union.asSlice(node_XY3$OFFSET, node_XY3$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_XY_24b_t node_XY3
         * }
         */
        public static void node_XY3(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_XY3$OFFSET, node_XY3$LAYOUT.byteSize());
        }

        private static final GroupLayout node_XY4$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_XY4"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_XY_26b_t node_XY4
         * }
         */
        public static final GroupLayout node_XY4$layout() {
            return node_XY4$LAYOUT;
        }

        private static final long node_XY4$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_XY_26b_t node_XY4
         * }
         */
        public static final long node_XY4$offset() {
            return node_XY4$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_XY_26b_t node_XY4
         * }
         */
        public static MemorySegment node_XY4(MemorySegment union) {
            return union.asSlice(node_XY4$OFFSET, node_XY4$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_XY_26b_t node_XY4
         * }
         */
        public static void node_XY4(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_XY4$OFFSET, node_XY4$LAYOUT.byteSize());
        }

        private static final GroupLayout node_XY5$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_XY5"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_XY_28b_t node_XY5
         * }
         */
        public static final GroupLayout node_XY5$layout() {
            return node_XY5$LAYOUT;
        }

        private static final long node_XY5$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_XY_28b_t node_XY5
         * }
         */
        public static final long node_XY5$offset() {
            return node_XY5$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_XY_28b_t node_XY5
         * }
         */
        public static MemorySegment node_XY5(MemorySegment union) {
            return union.asSlice(node_XY5$OFFSET, node_XY5$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_XY_28b_t node_XY5
         * }
         */
        public static void node_XY5(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_XY5$OFFSET, node_XY5$LAYOUT.byteSize());
        }

        private static final GroupLayout node_XY6$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_XY6"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_XY_32b_t node_XY6
         * }
         */
        public static final GroupLayout node_XY6$layout() {
            return node_XY6$LAYOUT;
        }

        private static final long node_XY6$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_XY_32b_t node_XY6
         * }
         */
        public static final long node_XY6$offset() {
            return node_XY6$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_XY_32b_t node_XY6
         * }
         */
        public static MemorySegment node_XY6(MemorySegment union) {
            return union.asSlice(node_XY6$OFFSET, node_XY6$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_XY_32b_t node_XY6
         * }
         */
        public static void node_XY6(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_XY6$OFFSET, node_XY6$LAYOUT.byteSize());
        }

        private static final GroupLayout node_LatLon$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node_LatLon"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Node_LLmD_64b_t node_LatLon
         * }
         */
        public static final GroupLayout node_LatLon$layout() {
            return node_LatLon$LAYOUT;
        }

        private static final long node_LatLon$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Node_LLmD_64b_t node_LatLon
         * }
         */
        public static final long node_LatLon$offset() {
            return node_LatLon$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Node_LLmD_64b_t node_LatLon
         * }
         */
        public static MemorySegment node_LatLon(MemorySegment union) {
            return union.asSlice(node_LatLon$OFFSET, node_LatLon$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Node_LLmD_64b_t node_LatLon
         * }
         */
        public static void node_LatLon(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, node_LatLon$OFFSET, node_LatLon$LAYOUT.byteSize());
        }

        private static final GroupLayout regional$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("regional"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NodeOffsetPointXY__regional_t regional
         * }
         */
        public static final GroupLayout regional$layout() {
            return regional$LAYOUT;
        }

        private static final long regional$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NodeOffsetPointXY__regional_t regional
         * }
         */
        public static final long regional$offset() {
            return regional$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NodeOffsetPointXY__regional_t regional
         * }
         */
        public static MemorySegment regional(MemorySegment union) {
            return union.asSlice(regional$OFFSET, regional$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NodeOffsetPointXY__regional_t regional
         * }
         */
        public static void regional(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, regional$OFFSET, regional$LAYOUT.byteSize());
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
     * union NodeOffsetPointXY_u choice
     * }
     */
    public static final GroupLayout choice$layout() {
        return choice$LAYOUT;
    }

    private static final long choice$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union NodeOffsetPointXY_u choice
     * }
     */
    public static final long choice$offset() {
        return choice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union NodeOffsetPointXY_u choice
     * }
     */
    public static MemorySegment choice(MemorySegment struct) {
        return struct.asSlice(choice$OFFSET, choice$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union NodeOffsetPointXY_u choice
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

    private static final long _asn_ctx$OFFSET = 48;

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
