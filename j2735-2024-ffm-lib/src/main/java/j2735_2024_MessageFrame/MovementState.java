// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct MovementState {
 *     DescriptiveName_t *movementName;
 *     SignalGroupID_t signalGroup;
 *     MovementEventList_t state_time_speed;
 *     struct ManeuverAssistList *maneuverAssistList;
 *     struct MovementState__regional {
 *         struct {
 *             struct Reg_MovementState **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_MovementState *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class MovementState {

    MovementState() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("movementName"),
        MessageFrame_h.C_LONG.withName("signalGroup"),
        MovementEventList.layout().withName("state_time_speed"),
        MessageFrame_h.C_POINTER.withName("maneuverAssistList"),
        MessageFrame_h.C_POINTER.withName("regional"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("MovementState");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout movementName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("movementName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DescriptiveName_t *movementName
     * }
     */
    public static final AddressLayout movementName$layout() {
        return movementName$LAYOUT;
    }

    private static final long movementName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DescriptiveName_t *movementName
     * }
     */
    public static final long movementName$offset() {
        return movementName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DescriptiveName_t *movementName
     * }
     */
    public static MemorySegment movementName(MemorySegment struct) {
        return struct.get(movementName$LAYOUT, movementName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DescriptiveName_t *movementName
     * }
     */
    public static void movementName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(movementName$LAYOUT, movementName$OFFSET, fieldValue);
    }

    private static final OfLong signalGroup$LAYOUT = (OfLong)$LAYOUT.select(groupElement("signalGroup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SignalGroupID_t signalGroup
     * }
     */
    public static final OfLong signalGroup$layout() {
        return signalGroup$LAYOUT;
    }

    private static final long signalGroup$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SignalGroupID_t signalGroup
     * }
     */
    public static final long signalGroup$offset() {
        return signalGroup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SignalGroupID_t signalGroup
     * }
     */
    public static long signalGroup(MemorySegment struct) {
        return struct.get(signalGroup$LAYOUT, signalGroup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SignalGroupID_t signalGroup
     * }
     */
    public static void signalGroup(MemorySegment struct, long fieldValue) {
        struct.set(signalGroup$LAYOUT, signalGroup$OFFSET, fieldValue);
    }

    private static final GroupLayout state_time_speed$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("state_time_speed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MovementEventList_t state_time_speed
     * }
     */
    public static final GroupLayout state_time_speed$layout() {
        return state_time_speed$LAYOUT;
    }

    private static final long state_time_speed$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MovementEventList_t state_time_speed
     * }
     */
    public static final long state_time_speed$offset() {
        return state_time_speed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MovementEventList_t state_time_speed
     * }
     */
    public static MemorySegment state_time_speed(MemorySegment struct) {
        return struct.asSlice(state_time_speed$OFFSET, state_time_speed$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MovementEventList_t state_time_speed
     * }
     */
    public static void state_time_speed(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, state_time_speed$OFFSET, state_time_speed$LAYOUT.byteSize());
    }

    private static final AddressLayout maneuverAssistList$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("maneuverAssistList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct ManeuverAssistList *maneuverAssistList
     * }
     */
    public static final AddressLayout maneuverAssistList$layout() {
        return maneuverAssistList$LAYOUT;
    }

    private static final long maneuverAssistList$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct ManeuverAssistList *maneuverAssistList
     * }
     */
    public static final long maneuverAssistList$offset() {
        return maneuverAssistList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct ManeuverAssistList *maneuverAssistList
     * }
     */
    public static MemorySegment maneuverAssistList(MemorySegment struct) {
        return struct.get(maneuverAssistList$LAYOUT, maneuverAssistList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct ManeuverAssistList *maneuverAssistList
     * }
     */
    public static void maneuverAssistList(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(maneuverAssistList$LAYOUT, maneuverAssistList$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct MovementState__regional {
     *     struct {
     *         struct Reg_MovementState **array;
     *         int count;
     *         int size;
     *         void (*free)(struct Reg_MovementState *);
     *     } list;
     *     asn_struct_ctx_t _asn_ctx;
     * }
     * }
     */
    public static class MovementState__regional {

        MovementState__regional() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            list.layout().withName("list"),
            asn_struct_ctx_s.layout().withName("_asn_ctx")
        ).withName("MovementState__regional");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     struct Reg_MovementState **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_MovementState *);
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
            ).withName("$anon$37:3");

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
             * struct Reg_MovementState **array
             * }
             */
            public static final AddressLayout array$layout() {
                return array$LAYOUT;
            }

            private static final long array$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * struct Reg_MovementState **array
             * }
             */
            public static final long array$offset() {
                return array$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * struct Reg_MovementState **array
             * }
             */
            public static MemorySegment array(MemorySegment struct) {
                return struct.get(array$LAYOUT, array$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * struct Reg_MovementState **array
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
             * void (*free)(struct Reg_MovementState *)
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
             * void (*free)(struct Reg_MovementState *)
             * }
             */
            public static final AddressLayout free$layout() {
                return free$LAYOUT;
            }

            private static final long free$OFFSET = 16;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_MovementState *)
             * }
             */
            public static final long free$offset() {
                return free$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_MovementState *)
             * }
             */
            public static MemorySegment free(MemorySegment struct) {
                return struct.get(free$LAYOUT, free$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_MovementState *)
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
         *     struct Reg_MovementState **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_MovementState *);
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
         *     struct Reg_MovementState **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_MovementState *);
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
         *     struct Reg_MovementState **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_MovementState *);
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
         *     struct Reg_MovementState **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_MovementState *);
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
     * struct MovementState__regional *regional
     * }
     */
    public static final AddressLayout regional$layout() {
        return regional$LAYOUT;
    }

    private static final long regional$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct MovementState__regional *regional
     * }
     */
    public static final long regional$offset() {
        return regional$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct MovementState__regional *regional
     * }
     */
    public static MemorySegment regional(MemorySegment struct) {
        return struct.get(regional$LAYOUT, regional$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct MovementState__regional *regional
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

    private static final long _asn_ctx$OFFSET = 80;

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

