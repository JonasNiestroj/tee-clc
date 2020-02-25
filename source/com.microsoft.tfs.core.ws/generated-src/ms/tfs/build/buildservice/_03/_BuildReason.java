// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _BuildReason
    extends FlagSet
{
    /**
     * Constructs a _BuildReason with no flags initially set.
     */
    public _BuildReason()
    {
        super();
    }

    /**
     * Constructs a _BuildReason with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _BuildReason(final _BuildReason_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _BuildReason with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _BuildReason(final String[] flagStrings)
    {
        super(flagStrings);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.microsoft.tfs.core.ws.runtime.types.FlagSet\#findFlagInstance(java.lang
     * .String)
     */
    protected Flag findFlagInstance(final String value)
        throws SOAPSerializationException
    {
        return _BuildReason_Flag.fromString(
            value,
            _BuildReason_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _BuildReason_Flag[] getFlags()
    {
        return (_BuildReason_Flag[]) this.toArray(new _BuildReason_Flag[this.size()]);
    }

    public boolean add(_BuildReason_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_BuildReason_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_BuildReason_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _BuildReason.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _BuildReason_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _BuildReason_Flag None = new _BuildReason_Flag("None");
        public static final _BuildReason_Flag Manual = new _BuildReason_Flag("Manual");
        public static final _BuildReason_Flag IndividualCI = new _BuildReason_Flag("IndividualCI");
        public static final _BuildReason_Flag BatchedCI = new _BuildReason_Flag("BatchedCI");
        public static final _BuildReason_Flag Schedule = new _BuildReason_Flag("Schedule");
        public static final _BuildReason_Flag ScheduleForced = new _BuildReason_Flag("ScheduleForced");
        public static final _BuildReason_Flag UserCreated = new _BuildReason_Flag("UserCreated");
        public static final _BuildReason_Flag ValidateShelveset = new _BuildReason_Flag("ValidateShelveset");
        public static final _BuildReason_Flag CheckInShelveset = new _BuildReason_Flag("CheckInShelveset");
        public static final _BuildReason_Flag Triggered = new _BuildReason_Flag("Triggered");
        public static final _BuildReason_Flag All = new _BuildReason_Flag("All");

        protected _BuildReason_Flag(final String name)
        {
            super(name, _BuildReason_Flag.VALUES_TO_INSTANCES);
        }
    }
}
