// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RoadSegment {
 *     DescriptiveName_t *name;
 *     RoadSegmentReferenceID_t id;
 *     Common_MsgCount_t revision;
 *     Position3D_t refPoint;
 *     LaneWidth_t *laneWidth;
 *     struct SpeedLimitList *speedLimits;
 *     RoadLaneSetList_t roadLaneSet;
 *     struct RoadSegment__regional {
 *         struct {
 *             struct Reg_RoadSegment **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_RoadSegment *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RoadSegment {

    RoadSegment() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("name"),
        RoadSegmentReferenceID.layout().withName("id"),
        MessageFrame_h.C_LONG.withName("revision"),
        Position3D.layout().withName("refPoint"),
        MessageFrame_h.C_POINTER.withName("laneWidth"),
        MessageFrame_h.C_POINTER.withName("speedLimits"),
        RoadLaneSetList.layout().withName("roadLaneSet"),
        MessageFrame_h.C_POINTER.withName("regional"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RoadSegment");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DescriptiveName_t *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DescriptiveName_t *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DescriptiveName_t *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DescriptiveName_t *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final GroupLayout id$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RoadSegmentReferenceID_t id
     * }
     */
    public static final GroupLayout id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RoadSegmentReferenceID_t id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RoadSegmentReferenceID_t id
     * }
     */
    public static MemorySegment id(MemorySegment struct) {
        return struct.asSlice(id$OFFSET, id$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RoadSegmentReferenceID_t id
     * }
     */
    public static void id(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, id$OFFSET, id$LAYOUT.byteSize());
    }

    private static final OfLong revision$LAYOUT = (OfLong)$LAYOUT.select(groupElement("revision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Common_MsgCount_t revision
     * }
     */
    public static final OfLong revision$layout() {
        return revision$LAYOUT;
    }

    private static final long revision$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Common_MsgCount_t revision
     * }
     */
    public static final long revision$offset() {
        return revision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t revision
     * }
     */
    public static long revision(MemorySegment struct) {
        return struct.get(revision$LAYOUT, revision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Common_MsgCount_t revision
     * }
     */
    public static void revision(MemorySegment struct, long fieldValue) {
        struct.set(revision$LAYOUT, revision$OFFSET, fieldValue);
    }

    private static final GroupLayout refPoint$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("refPoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Position3D_t refPoint
     * }
     */
    public static final GroupLayout refPoint$layout() {
        return refPoint$LAYOUT;
    }

    private static final long refPoint$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Position3D_t refPoint
     * }
     */
    public static final long refPoint$offset() {
        return refPoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Position3D_t refPoint
     * }
     */
    public static MemorySegment refPoint(MemorySegment struct) {
        return struct.asSlice(refPoint$OFFSET, refPoint$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Position3D_t refPoint
     * }
     */
    public static void refPoint(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, refPoint$OFFSET, refPoint$LAYOUT.byteSize());
    }

    private static final AddressLayout laneWidth$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("laneWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LaneWidth_t *laneWidth
     * }
     */
    public static final AddressLayout laneWidth$layout() {
        return laneWidth$LAYOUT;
    }

    private static final long laneWidth$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LaneWidth_t *laneWidth
     * }
     */
    public static final long laneWidth$offset() {
        return laneWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LaneWidth_t *laneWidth
     * }
     */
    public static MemorySegment laneWidth(MemorySegment struct) {
        return struct.get(laneWidth$LAYOUT, laneWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LaneWidth_t *laneWidth
     * }
     */
    public static void laneWidth(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(laneWidth$LAYOUT, laneWidth$OFFSET, fieldValue);
    }

    private static final AddressLayout speedLimits$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("speedLimits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct SpeedLimitList *speedLimits
     * }
     */
    public static final AddressLayout speedLimits$layout() {
        return speedLimits$LAYOUT;
    }

    private static final long speedLimits$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct SpeedLimitList *speedLimits
     * }
     */
    public static final long speedLimits$offset() {
        return speedLimits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct SpeedLimitList *speedLimits
     * }
     */
    public static MemorySegment speedLimits(MemorySegment struct) {
        return struct.get(speedLimits$LAYOUT, speedLimits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct SpeedLimitList *speedLimits
     * }
     */
    public static void speedLimits(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(speedLimits$LAYOUT, speedLimits$OFFSET, fieldValue);
    }

    private static final GroupLayout roadLaneSet$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("roadLaneSet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RoadLaneSetList_t roadLaneSet
     * }
     */
    public static final GroupLayout roadLaneSet$layout() {
        return roadLaneSet$LAYOUT;
    }

    private static final long roadLaneSet$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RoadLaneSetList_t roadLaneSet
     * }
     */
    public static final long roadLaneSet$offset() {
        return roadLaneSet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RoadLaneSetList_t roadLaneSet
     * }
     */
    public static MemorySegment roadLaneSet(MemorySegment struct) {
        return struct.asSlice(roadLaneSet$OFFSET, roadLaneSet$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RoadLaneSetList_t roadLaneSet
     * }
     */
    public static void roadLaneSet(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, roadLaneSet$OFFSET, roadLaneSet$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct RoadSegment__regional {
     *     struct {
     *         struct Reg_RoadSegment **array;
     *         int count;
     *         int size;
     *         void (*free)(struct Reg_RoadSegment *);
     *     } list;
     *     asn_struct_ctx_t _asn_ctx;
     * }
     * }
     */
    public static class RoadSegment__regional {

        RoadSegment__regional() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            list.layout().withName("list"),
            asn_struct_ctx_s.layout().withName("_asn_ctx")
        ).withName("RoadSegment__regional");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     struct Reg_RoadSegment **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_RoadSegment *);
         * }
         * }
         */
        public static class list {

            list() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                MessageFrame_h.C_POINTER.withName("array"),
                MessageFrame_h.C_INT.withName("count"),
                MessageFrame_h.C_INT.withName("size"),
                MessageFrame_h.C_POINTER.withName("free")
            ).withName("$anon$43:3");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final AddressLayout array$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("array"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * struct Reg_RoadSegment **array
             * }
             */
            public static final AddressLayout array$layout() {
                return array$LAYOUT;
            }

            private static final long array$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * struct Reg_RoadSegment **array
             * }
             */
            public static final long array$offset() {
                return array$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * struct Reg_RoadSegment **array
             * }
             */
            public static MemorySegment array(MemorySegment struct) {
                return struct.get(array$LAYOUT, array$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * struct Reg_RoadSegment **array
             * }
             */
            public static void array(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(array$LAYOUT, array$OFFSET, fieldValue);
            }

            private static final OfInt count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("count"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static final OfInt count$layout() {
                return count$LAYOUT;
            }

            private static final long count$OFFSET = 8;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static final long count$offset() {
                return count$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static int count(MemorySegment struct) {
                return struct.get(count$LAYOUT, count$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static void count(MemorySegment struct, int fieldValue) {
                struct.set(count$LAYOUT, count$OFFSET, fieldValue);
            }

            private static final OfInt size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("size"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static final OfInt size$layout() {
                return size$LAYOUT;
            }

            private static final long size$OFFSET = 12;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static final long size$offset() {
                return size$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static int size(MemorySegment struct) {
                return struct.get(size$LAYOUT, size$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static void size(MemorySegment struct, int fieldValue) {
                struct.set(size$LAYOUT, size$OFFSET, fieldValue);
            }

            /**
             * {@snippet lang=c :
             * void (*free)(struct Reg_RoadSegment *)
             * }
             */
            public static class free {

                free() {
                    // Should not be called directly
                }

                /**
                 * The function pointer signature, expressed as a functional interface
                 */
                public interface Function {
                    void apply(MemorySegment _x0);
                }

                private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
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
                public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
                    try {
                         DOWN$MH.invokeExact(funcPtr, _x0);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                }
            }

            private static final AddressLayout free$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("free"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_RoadSegment *)
             * }
             */
            public static final AddressLayout free$layout() {
                return free$LAYOUT;
            }

            private static final long free$OFFSET = 16;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_RoadSegment *)
             * }
             */
            public static final long free$offset() {
                return free$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_RoadSegment *)
             * }
             */
            public static MemorySegment free(MemorySegment struct) {
                return struct.get(free$LAYOUT, free$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_RoadSegment *)
             * }
             */
            public static void free(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(free$LAYOUT, free$OFFSET, fieldValue);
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

        private static final GroupLayout list$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("list"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_RoadSegment **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_RoadSegment *);
         * } list
         * }
         */
        public static final GroupLayout list$layout() {
            return list$LAYOUT;
        }

        private static final long list$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_RoadSegment **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_RoadSegment *);
         * } list
         * }
         */
        public static final long list$offset() {
            return list$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_RoadSegment **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_RoadSegment *);
         * } list
         * }
         */
        public static MemorySegment list(MemorySegment struct) {
            return struct.asSlice(list$OFFSET, list$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_RoadSegment **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_RoadSegment *);
         * } list
         * }
         */
        public static void list(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, list$OFFSET, list$LAYOUT.byteSize());
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

        private static final long _asn_ctx$OFFSET = 24;

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

    private static final AddressLayout regional$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("regional"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct RoadSegment__regional *regional
     * }
     */
    public static final AddressLayout regional$layout() {
        return regional$LAYOUT;
    }

    private static final long regional$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct RoadSegment__regional *regional
     * }
     */
    public static final long regional$offset() {
        return regional$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct RoadSegment__regional *regional
     * }
     */
    public static MemorySegment regional(MemorySegment struct) {
        return struct.get(regional$LAYOUT, regional$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct RoadSegment__regional *regional
     * }
     */
    public static void regional(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(regional$LAYOUT, regional$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 184;

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
