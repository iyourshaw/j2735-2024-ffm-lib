// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct Reg_MapData {
 *     RegionId_t regionId;
 *     struct Reg_MapData__regExtValue {
 *         Reg_MapData__regExtValue_PR present;
 *         union Reg_MapData__regExtValue_u {
 *             MapData_addGrpC_t MapData_addGrpC;
 *         } choice;
 *         asn_struct_ctx_t _asn_ctx;
 *     } regExtValue;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class Reg_MapData {

    Reg_MapData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("regionId"),
        Reg_MapData__regExtValue.layout().withName("regExtValue"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("Reg_MapData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong regionId$LAYOUT = (OfLong)$LAYOUT.select(groupElement("regionId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RegionId_t regionId
     * }
     */
    public static final OfLong regionId$layout() {
        return regionId$LAYOUT;
    }

    private static final long regionId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RegionId_t regionId
     * }
     */
    public static final long regionId$offset() {
        return regionId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RegionId_t regionId
     * }
     */
    public static long regionId(MemorySegment struct) {
        return struct.get(regionId$LAYOUT, regionId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RegionId_t regionId
     * }
     */
    public static void regionId(MemorySegment struct, long fieldValue) {
        struct.set(regionId$LAYOUT, regionId$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct Reg_MapData__regExtValue {
     *     Reg_MapData__regExtValue_PR present;
     *     union Reg_MapData__regExtValue_u {
     *         MapData_addGrpC_t MapData_addGrpC;
     *     } choice;
     *     asn_struct_ctx_t _asn_ctx;
     * }
     * }
     */
    public static class Reg_MapData__regExtValue {

        Reg_MapData__regExtValue() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            MessageFrame_h.C_INT.withName("present"),
            MemoryLayout.paddingLayout(4),
            Reg_MapData__regExtValue_u.layout().withName("choice"),
            asn_struct_ctx_s.layout().withName("_asn_ctx")
        ).withName("Reg_MapData__regExtValue");

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
         * Reg_MapData__regExtValue_PR present
         * }
         */
        public static final OfInt present$layout() {
            return present$LAYOUT;
        }

        private static final long present$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Reg_MapData__regExtValue_PR present
         * }
         */
        public static final long present$offset() {
            return present$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Reg_MapData__regExtValue_PR present
         * }
         */
        public static int present(MemorySegment struct) {
            return struct.get(present$LAYOUT, present$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Reg_MapData__regExtValue_PR present
         * }
         */
        public static void present(MemorySegment struct, int fieldValue) {
            struct.set(present$LAYOUT, present$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * union Reg_MapData__regExtValue_u {
         *     MapData_addGrpC_t MapData_addGrpC;
         * }
         * }
         */
        public static class Reg_MapData__regExtValue_u {

            Reg_MapData__regExtValue_u() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
                MapData_addGrpC.layout().withName("MapData_addGrpC")
            ).withName("Reg_MapData__regExtValue_u");

            /**
             * The layout of this union
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final GroupLayout MapData_addGrpC$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("MapData_addGrpC"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * MapData_addGrpC_t MapData_addGrpC
             * }
             */
            public static final GroupLayout MapData_addGrpC$layout() {
                return MapData_addGrpC$LAYOUT;
            }

            private static final long MapData_addGrpC$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * MapData_addGrpC_t MapData_addGrpC
             * }
             */
            public static final long MapData_addGrpC$offset() {
                return MapData_addGrpC$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * MapData_addGrpC_t MapData_addGrpC
             * }
             */
            public static MemorySegment MapData_addGrpC(MemorySegment union) {
                return union.asSlice(MapData_addGrpC$OFFSET, MapData_addGrpC$LAYOUT.byteSize());
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * MapData_addGrpC_t MapData_addGrpC
             * }
             */
            public static void MapData_addGrpC(MemorySegment union, MemorySegment fieldValue) {
                MemorySegment.copy(fieldValue, 0L, union, MapData_addGrpC$OFFSET, MapData_addGrpC$LAYOUT.byteSize());
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
         * union Reg_MapData__regExtValue_u choice
         * }
         */
        public static final GroupLayout choice$layout() {
            return choice$LAYOUT;
        }

        private static final long choice$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * union Reg_MapData__regExtValue_u choice
         * }
         */
        public static final long choice$offset() {
            return choice$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * union Reg_MapData__regExtValue_u choice
         * }
         */
        public static MemorySegment choice(MemorySegment struct) {
            return struct.asSlice(choice$OFFSET, choice$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * union Reg_MapData__regExtValue_u choice
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

        private static final long _asn_ctx$OFFSET = 40;

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

    private static final GroupLayout regExtValue$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("regExtValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Reg_MapData__regExtValue regExtValue
     * }
     */
    public static final GroupLayout regExtValue$layout() {
        return regExtValue$LAYOUT;
    }

    private static final long regExtValue$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Reg_MapData__regExtValue regExtValue
     * }
     */
    public static final long regExtValue$offset() {
        return regExtValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Reg_MapData__regExtValue regExtValue
     * }
     */
    public static MemorySegment regExtValue(MemorySegment struct) {
        return struct.asSlice(regExtValue$OFFSET, regExtValue$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Reg_MapData__regExtValue regExtValue
     * }
     */
    public static void regExtValue(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, regExtValue$OFFSET, regExtValue$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 72;

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

