// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct asn_ioc_cell_s {
 *     const char *field_name;
 *     enum {
 *         aioc__undefined = 0,
 *         aioc__value,
 *         aioc__type,
 *         aioc__open_type
 *     } cell_kind;
 *     struct asn_TYPE_descriptor_s *type_descriptor;
 *     const void *value_sptr;
 *     struct {
 *         size_t types_count;
 *         struct {
 *             unsigned int choice_position;
 *         } *types;
 *     } open_type;
 * }
 * }
 */
public class asn_ioc_cell_s {

    asn_ioc_cell_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("field_name"),
        MessageFrame_h.C_INT.withName("cell_kind"),
        MemoryLayout.paddingLayout(4),
        MessageFrame_h.C_POINTER.withName("type_descriptor"),
        MessageFrame_h.C_POINTER.withName("value_sptr"),
        open_type.layout().withName("open_type")
    ).withName("asn_ioc_cell_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout field_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("field_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *field_name
     * }
     */
    public static final AddressLayout field_name$layout() {
        return field_name$LAYOUT;
    }

    private static final long field_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *field_name
     * }
     */
    public static final long field_name$offset() {
        return field_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *field_name
     * }
     */
    public static MemorySegment field_name(MemorySegment struct) {
        return struct.get(field_name$LAYOUT, field_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *field_name
     * }
     */
    public static void field_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(field_name$LAYOUT, field_name$OFFSET, fieldValue);
    }

    private static final OfInt cell_kind$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cell_kind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum {
     *     aioc__undefined = 0,
     *     aioc__value,
     *     aioc__type,
     *     aioc__open_type
     * } cell_kind
     * }
     */
    public static final OfInt cell_kind$layout() {
        return cell_kind$LAYOUT;
    }

    private static final long cell_kind$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum {
     *     aioc__undefined = 0,
     *     aioc__value,
     *     aioc__type,
     *     aioc__open_type
     * } cell_kind
     * }
     */
    public static final long cell_kind$offset() {
        return cell_kind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum {
     *     aioc__undefined = 0,
     *     aioc__value,
     *     aioc__type,
     *     aioc__open_type
     * } cell_kind
     * }
     */
    public static int cell_kind(MemorySegment struct) {
        return struct.get(cell_kind$LAYOUT, cell_kind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum {
     *     aioc__undefined = 0,
     *     aioc__value,
     *     aioc__type,
     *     aioc__open_type
     * } cell_kind
     * }
     */
    public static void cell_kind(MemorySegment struct, int fieldValue) {
        struct.set(cell_kind$LAYOUT, cell_kind$OFFSET, fieldValue);
    }

    private static final AddressLayout type_descriptor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("type_descriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct asn_TYPE_descriptor_s *type_descriptor
     * }
     */
    public static final AddressLayout type_descriptor$layout() {
        return type_descriptor$LAYOUT;
    }

    private static final long type_descriptor$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct asn_TYPE_descriptor_s *type_descriptor
     * }
     */
    public static final long type_descriptor$offset() {
        return type_descriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct asn_TYPE_descriptor_s *type_descriptor
     * }
     */
    public static MemorySegment type_descriptor(MemorySegment struct) {
        return struct.get(type_descriptor$LAYOUT, type_descriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct asn_TYPE_descriptor_s *type_descriptor
     * }
     */
    public static void type_descriptor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(type_descriptor$LAYOUT, type_descriptor$OFFSET, fieldValue);
    }

    private static final AddressLayout value_sptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value_sptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *value_sptr
     * }
     */
    public static final AddressLayout value_sptr$layout() {
        return value_sptr$LAYOUT;
    }

    private static final long value_sptr$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *value_sptr
     * }
     */
    public static final long value_sptr$offset() {
        return value_sptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *value_sptr
     * }
     */
    public static MemorySegment value_sptr(MemorySegment struct) {
        return struct.get(value_sptr$LAYOUT, value_sptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *value_sptr
     * }
     */
    public static void value_sptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value_sptr$LAYOUT, value_sptr$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     size_t types_count;
     *     struct {
     *         unsigned int choice_position;
     *     } *types;
     * }
     * }
     */
    public static class open_type {

        open_type() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            MessageFrame_h.C_LONG.withName("types_count"),
            MessageFrame_h.C_POINTER.withName("types")
        ).withName("$anon$38:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfLong types_count$LAYOUT = (OfLong)$LAYOUT.select(groupElement("types_count"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * size_t types_count
         * }
         */
        public static final OfLong types_count$layout() {
            return types_count$LAYOUT;
        }

        private static final long types_count$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * size_t types_count
         * }
         */
        public static final long types_count$offset() {
            return types_count$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * size_t types_count
         * }
         */
        public static long types_count(MemorySegment struct) {
            return struct.get(types_count$LAYOUT, types_count$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * size_t types_count
         * }
         */
        public static void types_count(MemorySegment struct, long fieldValue) {
            struct.set(types_count$LAYOUT, types_count$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     unsigned int choice_position;
         * }
         * }
         */
        public static class types {

            types() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                MessageFrame_h.C_INT.withName("choice_position")
            ).withName("$anon$40:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfInt choice_position$LAYOUT = (OfInt)$LAYOUT.select(groupElement("choice_position"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * unsigned int choice_position
             * }
             */
            public static final OfInt choice_position$layout() {
                return choice_position$LAYOUT;
            }

            private static final long choice_position$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * unsigned int choice_position
             * }
             */
            public static final long choice_position$offset() {
                return choice_position$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * unsigned int choice_position
             * }
             */
            public static int choice_position(MemorySegment struct) {
                return struct.get(choice_position$LAYOUT, choice_position$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * unsigned int choice_position
             * }
             */
            public static void choice_position(MemorySegment struct, int fieldValue) {
                struct.set(choice_position$LAYOUT, choice_position$OFFSET, fieldValue);
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

        private static final AddressLayout types$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("types"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     unsigned int choice_position;
         * } *types
         * }
         */
        public static final AddressLayout types$layout() {
            return types$LAYOUT;
        }

        private static final long types$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     unsigned int choice_position;
         * } *types
         * }
         */
        public static final long types$offset() {
            return types$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     unsigned int choice_position;
         * } *types
         * }
         */
        public static MemorySegment types(MemorySegment struct) {
            return struct.get(types$LAYOUT, types$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     unsigned int choice_position;
         * } *types
         * }
         */
        public static void types(MemorySegment struct, MemorySegment fieldValue) {
            struct.set(types$LAYOUT, types$OFFSET, fieldValue);
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

    private static final GroupLayout open_type$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("open_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     size_t types_count;
     *     struct {
     *         unsigned int choice_position;
     *     } *types;
     * } open_type
     * }
     */
    public static final GroupLayout open_type$layout() {
        return open_type$LAYOUT;
    }

    private static final long open_type$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     size_t types_count;
     *     struct {
     *         unsigned int choice_position;
     *     } *types;
     * } open_type
     * }
     */
    public static final long open_type$offset() {
        return open_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     size_t types_count;
     *     struct {
     *         unsigned int choice_position;
     *     } *types;
     * } open_type
     * }
     */
    public static MemorySegment open_type(MemorySegment struct) {
        return struct.asSlice(open_type$OFFSET, open_type$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     size_t types_count;
     *     struct {
     *         unsigned int choice_position;
     *     } *types;
     * } open_type
     * }
     */
    public static void open_type(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, open_type$OFFSET, open_type$LAYOUT.byteSize());
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

